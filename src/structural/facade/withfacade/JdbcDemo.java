package structural.facade.withfacade;

import structural.facade.models.Address;

import java.util.List;

public class JdbcDemo {
    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();
        jdbcFacade.createTable();

        jdbcFacade.insertIntoTable();

        List<Address> addressList = jdbcFacade.getAddresses();

        addressList.stream().forEach(System.out::println);
    }
}
