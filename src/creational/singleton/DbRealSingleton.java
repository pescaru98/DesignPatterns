package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Tutorial class to connect to a database.
 * Use later in Facade pattern (structural)
 */
public class DbRealSingleton {
    private static volatile DbRealSingleton instance = null;
    private static volatile Connection conn = null;

    private DbRealSingleton() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "20Pescaru");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

/*
        if (conn != null) {
            throw new RuntimeException("Use getConnection() method to create");
        }

        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
*/

    }

    public static DbRealSingleton getInstance() {
        if (instance == null) {
            synchronized (DbRealSingleton.class) {
                if (instance == null) {
                    instance = new DbRealSingleton();
                }
            }
        }

        return instance;
    }

    public Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                synchronized (DbRealSingleton.class) {
                    if (conn == null || conn.isClosed()) {
                        try {
                            String dbUrl = "jdbc:mysql://localhost:3306/testdb";
                            Class.forName("com.mysql.cj.jdbc.Driver");

                            conn = DriverManager.getConnection(dbUrl, "root", "20Pescaru");
                        } catch (SQLException | ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
}
