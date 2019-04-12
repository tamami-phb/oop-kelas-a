package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import services.*;
import javax.sound.sampled.*;
import java.io.*;

public class MainUI extends JFrame {

    private JButton btnPlay;
    private JButton btnStop;
    private Container contentPane;
    private MyPlayer player;

    public MainUI() {
        try {
            player = new MyPlayer("./audio/sample.au");
        } catch(UnsupportedAudioFileException e) {
            JOptionPane.showMessageDialog(this,
                    "Kesalahan",
                    "berkas tersebut tidak didukung",
                    JOptionPane.ERROR_MESSAGE);
        } catch(LineUnavailableException e) {
            JOptionPane.showMessageDialog(this,
                    "Hubungi developer");
        } catch(IOException e) {
            JOptionPane.showMessageDialog(this,
                    "File tidak bisa diakses");
        }
        initUI();
    }

    private void initUI() {
        btnPlay = new JButton("Putar");
        btnStop = new JButton("Hentikan");

        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
        contentPane.add(btnPlay);
        contentPane.add(btnStop);

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnPlay.addActionListener(new BtnPlayClick());
        btnStop.addActionListener(new BtnStopClick());
    }


    // ------- events

    class BtnPlayClick implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            player.play();
        }
    }

    class BtnStopClick implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            player.stop();
        }
    }

}