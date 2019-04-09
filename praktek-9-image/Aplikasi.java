import javax.swing.*;


public class Aplikasi {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Gambar");
        ImageIcon ikon = new ImageIcon("img/foto.jpeg");
        JLabel label = new JLabel(ikon);
        frame.add(label);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}