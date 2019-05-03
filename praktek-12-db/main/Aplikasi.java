package main;

import java.sql.*;

import util.*;
import ui.*;

public class Aplikasi {

    public static Koneksi koneksi;
    public static MainUI mainUI;

    public static void main(String[] args) throws SQLException {
        koneksi = new Koneksi();
        mainUI = new MainUI();
    }

}