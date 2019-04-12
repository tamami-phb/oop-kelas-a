package services;

import java.io.*;
import javax.sound.sampled.*;

public class MyPlayer {

    private AudioInputStream ais;
    private Clip clip;
    private String filePath;
    private Long currentPosition;

    public MyPlayer(String filePath) throws
            UnsupportedAudioFileException,
            LineUnavailableException, IOException {
        ais = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
        clip = AudioSystem.getClip();
        clip.open(ais);
        this.filePath = filePath;
    }

    public void play() {
        clip.start();
    }

    public void pause() {
        currentPosition = clip.getMicrosecondPosition();
        clip.stop();
        clip.close();
    }

    public void resume() throws
            UnsupportedAudioFileException,
            LineUnavailableException, IOException {
        reset();
        clip.setMicrosecondPosition(currentPosition);
        clip.start();
    }

    public void stop() throws
            UnsupportedAudioFileException,
            LineUnavailableException, IOException {
        clip.stop();
        clip.close();
        reset();
    }

    public void reset() throws
            UnsupportedAudioFileException,
            LineUnavailableException, IOException {
        ais = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
        clip = AudioSystem.getClip();
        clip.open(ais);
    }

}