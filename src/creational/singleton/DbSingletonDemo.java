package creational.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {
    public static void main(String[] args) {
        DbRealSingleton instance = DbRealSingleton.getInstance();

        Connection conn = instance.getConnection();

        Statement sta;
        try {
            sta = conn.createStatement();
            sta.execute("insert into testtable (name) values ('nume')");

            sta.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
