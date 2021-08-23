package structural.facade.withoutfacade;

import creational.singleton.DbRealSingleton;
import creational.singleton.DbSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Without facade, we have a creation, an insertion and a selection in the same file
 */
public class JdbcDemo {

    public static void main(String[] args) {
        DbRealSingleton instance = DbRealSingleton.getInstance();

        try {
            Connection conn = instance.getConnection();

            Statement sta = conn.createStatement();
            int count = sta.executeUpdate("CREATE TABLE Address (ID integer, StreetName varchar(20), City varchar(20));");
            System.out.println("Table created!");

            sta.close();

            sta = conn.createStatement();
            sta.executeUpdate("insert into Address(ID, StreetName, City) values (1, 'Timisoarei', 'Severin')");
            sta.close();

            sta = conn.createStatement();
            ResultSet rs = sta.executeQuery("select * from Address");

            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2));
            }
            sta.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
