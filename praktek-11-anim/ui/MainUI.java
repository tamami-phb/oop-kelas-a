package ui;

import javax.swing.*;

public class MainUI extends JFrame {

    private PapanGambar papan;

    public MainUI() {
        initUI();
    }

    private void initUI() {
        papan = new PapanGambar();
        add(papan);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}