import java.sql.*;

import util.*;

public class Aplikasi {

    public static Koneksi koneksi;

    public static void main(String[] args) throws SQLException {
        koneksi = new Koneksi();
        koneksi.select("select * from mahasiswa");
    }

}