import java.awt.*;
import javax.swing.*;

public class Aplikasi {

    public static void main(String[] args) {
        JFrame app = new JFrame("Test Jendela");

        JLabel lblNim = new JLabel("NIM");
        JLabel lblNama = new JLabel("NAMA");
        JLabel lblKelas = new JLabel("KELAS");
        JTextField txtNim = new JTextField();
        JTextField txtNama = new JTextField();
        JTextField txtKelas = new JTextField();
        JButton btn = new JButton("Simpan");
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(3, 2));
        panel.add(lblNim); panel.add(txtNim);
        panel.add(lblNama); panel.add(txtNama);
        panel.add(lblKelas); panel.add(txtKelas);

        app.getContentPane().add(panel, BorderLayout.CENTER);
        app.getContentPane().add(btn, BorderLayout.SOUTH);

        app.setSize(300, 200);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}