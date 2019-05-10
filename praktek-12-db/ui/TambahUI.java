package ui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import main.*;
import java.sql.*;

public class TambahUI extends JFrame {

    private Container contentPane;
    private JPanel panelForm;
    private JPanel panelButton;
    private JLabel lblNim;
    private JLabel lblNama;
    private JLabel lblKelas;
    private JTextField txtNim;
    private JTextField txtNama;
    private JTextField txtKelas;
    private JButton btnSimpan;
    private JButton btnBatal;

    public TambahUI() {
        initUI();
    }

    private void initUI() {
        setTitle("Tambah Data Baru");

        contentPane = getContentPane();

        lblNim = new JLabel("NIM");
        lblNama = new JLabel("NAMA");
        lblKelas = new JLabel("KELAS");
        txtNim = new JTextField();
        txtNama = new JTextField();
        txtKelas = new JTextField();
        panelForm = new JPanel();
        panelForm.setLayout(new GridLayout(3,2));
        panelForm.add(lblNim); panelForm.add(txtNim);
        panelForm.add(lblNama); panelForm.add(txtNama);
        panelForm.add(lblKelas); panelForm.add(txtKelas);
        contentPane.add(panelForm, BorderLayout.CENTER);

        btnSimpan = new JButton("Simpan");
        btnBatal = new JButton("Batal");
        panelButton = new JPanel();
        panelButton.setLayout(new GridLayout(1, 2));
        panelButton.add(btnSimpan);
        panelButton.add(btnBatal);
        contentPane.add(panelButton, BorderLayout.SOUTH);

        pack();

        btnSimpan.addActionListener(new BtnSimpanClick());
    }


    // ------ events

    private class BtnSimpanClick implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            String nim, nama, kelas;
            nim = txtNim.getText();
            nama = txtNama.getText();
            kelas = txtKelas.getText();
            String query = "insert into mahasiswa(nim,nama,kelas) " +
                    "values('" + nim + "','" + nama + "','" + kelas + "')";
            try {
                int result = Aplikasi.koneksi.update(query);
                if(result > 0) {
                    JOptionPane.showMessageDialog(null, "Data telah tersimpan");
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak ada data yang berubah");
                }
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Ada kesalahan query");
            }
        }
    }

}