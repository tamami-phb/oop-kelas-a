import java.sql.*;

public class Aplikasi {



    public static void main(String[] args) throws SQLException {
        Connection connection =
                DriverManager.getConnection(
                        "jdbc:mariadb://localhost:3306/mahasiswa?user=root&password=rahasia"
                );
        Statement stmt = connection.createStatement();

        int row = stmt.executeUpdate("insert into data_mahasiswa(nim, nama, jurusan) " +
                "values('19002', 'diva', 'DIV - TI') ");
        if(row > 0) System.out.println("Data baru telah tersimpan");


        ResultSet rs = stmt.executeQuery("select * from data_mahasiswa");

        int i=1;
        while(rs.next()) {
            System.out.println("data ke-" + i++);
            System.out.println("  NIM : " + rs.getString(1));
            System.out.println("  NAMA : " + rs.getString(2));
            System.out.println("  JURUSAN : " + rs.getString(3));
        }

        connection.close();
    }

}