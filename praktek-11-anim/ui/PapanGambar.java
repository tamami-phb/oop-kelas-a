package ui;

import javax.swing.*;
import java.awt.*;

public class PapanGambar extends JPanel {

    private Image image;
    private Timer timer;
    private int x, y;

    private final int WIDTH = 350;
    private final int HEIGHT = 350;
    private final int INIT_X = 0;
    private final int INIT_Y = 0;
    private final int DELAY = 25;

    public PapanGambar() {
        initUI();
    }

    private void initUI() {
        setBackground(Color.black);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        x = INIT_X;
        y = INIT_Y;

        loadImage();
    }

    private void loadImage() {
        ImageIcon icon = new ImageIcon("image/star.png");
        image = icon.getImage();
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        gambar(graphics);
    }

    private void gambar(Graphics g) {
        g.drawImage(image, x, y, this);
        Toolkit.getDefaultToolkit().sync();
    }

}