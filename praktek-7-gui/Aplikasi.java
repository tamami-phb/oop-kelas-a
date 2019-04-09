import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Aplikasi {
    static JTextField txtNim;
    static JTextField txtNama;
    static JTextField txtKelas;

    public static void main(String[] args) {
        JFrame app = new JFrame("Test Jendela");

        JLabel lblNim = new JLabel("NIM");
        JLabel lblNama = new JLabel("NAMA");
        JLabel lblKelas = new JLabel("KELAS");
        txtNim = new JTextField();
        txtNama = new JTextField();
        txtKelas = new JTextField();
        JButton btn = new JButton("Simpan");
        btn.addActionListener(new BtnClick());
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

    private static class BtnClick implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null, "Selamat datang, info yang diisikan adalah \n" +
                    txtNim.getText() + " - " + txtNama.getText() + " - " + txtKelas.getText());
        }

    }

}