package structural.facade.withfacade;

import creational.singleton.DbRealSingleton;
import structural.facade.models.Address;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * -> Use composition (instance)
 * -> Should not utilize inheritance. In the need of this case, find another pattern
 * -> Offers an abstraction/simplification over some implementation that clients should not be aware of
 */
public class JdbcFacade {
    DbRealSingleton instance = null;

    public JdbcFacade() {
        instance = DbRealSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;
        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("CREATE TABLE Address (ID integer, StreetName varchar(20), City varchar(20));");
            sta.close();
            conn.close();
            conn = null;
        } catch(Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("insert into Address(ID, StreetName, City) values (1, 'Timisoarei', 'Severin')");
            System.out.println("Table created!");
            sta.close();
            conn.close();
            conn = null;
        } catch(Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    public List<Address> getAddresses() {
        List<Address> list = new ArrayList<>();
        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            ResultSet rs = sta.executeQuery("select id, streetName, city from Address");

            while (rs.next()) {
                list.add(new Address(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            rs.close();
            sta.close();
            conn.close();
            conn = null;
        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
