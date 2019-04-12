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
    private JButton btnPause;
    private JButton btnResume;
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
        btnPause = new JButton("Jeda");
        btnResume = new JButton("Lanjutkan");

        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
        contentPane.add(btnPlay);
        contentPane.add(btnStop);
        contentPane.add(btnPause);
        contentPane.add(btnResume);
        btnStop.setEnabled(false);
        btnPause.setEnabled(false);
        btnResume.setEnabled(false);

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnPlay.addActionListener(new BtnPlayClick());
        btnStop.addActionListener(new BtnStopClick());
        btnPause.addActionListener(new BtnPauseClick());
        btnResume.addActionListener(new BtnResumeClick());
    }


    // ------- events

    class BtnPauseClick implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            player.pause();
            btnPlay.setEnabled(false);
            btnPause.setEnabled(false);
            btnStop.setEnabled(true);
            btnResume.setEnabled(true);
        }
    }

    class BtnResumeClick implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            try {
                player.resume();
            } catch(UnsupportedAudioFileException e) {
                JOptionPane.showMessageDialog(null,
                        "Kesalahan",
                        "berkas tersebut tidak didukung",
                        JOptionPane.ERROR_MESSAGE);
            } catch(LineUnavailableException e) {
                JOptionPane.showMessageDialog(null,
                        "Hubungi developer");
            } catch(IOException e) {
                JOptionPane.showMessageDialog(null,
                        "File tidak bisa diakses");
            }
            btnResume.setEnabled(false);
            btnPlay.setEnabled(false);
            btnPause.setEnabled(true);
            btnStop.setEnabled(true);
        }
    }

    class BtnPlayClick implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            player.play();
            btnStop.setEnabled(true);
            btnPause.setEnabled(true);
            btnResume.setEnabled(false);
            btnPlay.setEnabled(false);
        }
    }

    class BtnStopClick implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            try {
                player.stop();
            } catch(UnsupportedAudioFileException e) {
                JOptionPane.showMessageDialog(null,
                    "Kesalahan",
                    "berkas tersebut tidak didukung",
                    JOptionPane.ERROR_MESSAGE);
            } catch(LineUnavailableException e) {
                JOptionPane.showMessageDialog(null,
                    "Hubungi developer");
            } catch(IOException e) {
                JOptionPane.showMessageDialog(null,
                    "File tidak bisa diakses");
            }
            btnStop.setEnabled(false);
            btnPause.setEnabled(false);
            btnResume.setEnabled(false);
            btnPlay.setEnabled(true);
        }
    }

}