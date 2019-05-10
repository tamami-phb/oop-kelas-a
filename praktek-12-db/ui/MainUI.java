package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.sql.*;
import main.*;

public class MainUI extends JFrame {

    private JTable tabel;
    private JButton btnTambah;
    private JButton btnUbah;
    private JButton btnHapus;
    private JPanel panelButton;
    private Container contentPane;
    private ResultSet isiTabel;
    private Vector rowData;
    private Vector columnName;
    private DefaultTableModel tableModel;
    private JScrollPane scrollPane;
    private static TambahUI tambahUI;
    private static UbahUI ubahUI;

    public JButton getBtnHapus() {
        return btnHapus;
    }

    public MainUI() {
        initUI();
        initData();
    }

    private void initData() {
        try {
            isiTabel = Aplikasi.koneksi.select("select * from mahasiswa");
            rowData = new Vector();
            while(isiTabel.next()) {
                Vector temp = new Vector();
                temp.add(isiTabel.getString(1));
                temp.add(isiTabel.getString(2));
                temp.add(isiTabel.getString(3));
                rowData.add(temp);
            }
            tableModel.setDataVector(rowData, columnName);
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this,
                    "Gagal terkoneksi ke database");
        }
    }

    public void refreshTable() {
        initData();
    }

    private void initUI() {
        setTitle("Aplikasi Mahasiswa");

        contentPane = getContentPane();

        tambahUI = new TambahUI(this);
        ubahUI = new UbahUI(this);

        columnName = new Vector();
        columnName.add("NIM");
        columnName.add("NAMA");
        columnName.add("KELAS");
        rowData = new Vector();
        Vector row1 = new Vector();
        row1.add("19001");
        row1.add("test-nama");
        row1.add("test-kelas");
        rowData.add(row1);
        tableModel = new DefaultTableModel(rowData, columnName);
        tableModel.setColumnIdentifiers(columnName.toArray());
        tabel = new JTable(tableModel);
        tabel.setSelectionModel(new SingleRowMode());
        scrollPane = new JScrollPane(tabel);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        btnTambah = new JButton("Tambah");
        btnUbah = new JButton("Ubah");
        btnHapus = new JButton("Hapus");
        panelButton = new JPanel();
        panelButton.setLayout(new GridLayout(1, 3));
        panelButton.add(btnTambah);
        panelButton.add(btnUbah);
        panelButton.add(btnHapus);
        contentPane.add(panelButton, BorderLayout.SOUTH);

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnTambah.addActionListener(new BtnTambahClick());
        btnUbah.addActionListener(new BtnUbahClick());
    }

    // ----- inner class

    private class SingleRowMode extends DefaultListSelectionModel {
        public SingleRowMode() {
            setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        }
    }


    // -------- events

    private class BtnTambahClick implements ActionListener {
        public void actionPerformed(ActionEvent evt) {

            tambahUI.setVisible(true);
        }
    }

    private class BtnUbahClick implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            String nim, nama, kelas;
            if(tabel.getSelectedRow() != -1) {
                nim = "" + tabel.getValueAt(tabel.getSelectedRow(), 0);
                nama = tabel.getValueAt(tabel.getSelectedRow(), 1).toString();
                kelas = (String) tabel.getValueAt(tabel.getSelectedRow(), 2);
                ubahUI.tampilkan(nim, nama, kelas);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Silahkan pilih dahulu data yang akan diubah");
            }
        }
    }

}