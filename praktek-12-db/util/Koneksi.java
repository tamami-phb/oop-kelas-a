package util;

import java.sql.*;

public class Koneksi {

    private Connection connection;
    private Statement statement;

    private void openConnection() throws
            SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost/mahasiswa",
                "root", "rahasia"
        );
        statement = connection.createStatement();
    }

    private void closeConnection() throws
            SQLException {
        connection.close();
    }

    // SELECT
    public ResultSet select(String query) throws
            SQLException {
        openConnection();
        ResultSet hasil = statement.executeQuery(query);
        closeConnection();
        return hasil;
    }

    // UPDATE, DELETE, INSERT
    public int update(String query) throws
            SQLException {
        openConnection();
        int hasil = statement.executeUpdate(query);
        closeConnection();
        return hasil;
    }

}