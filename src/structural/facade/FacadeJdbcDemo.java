package structural.facade;

import java.util.List;

public class FacadeJdbcDemo {

    // showcases the simplicity introduced to the client
    // for setting up a JDBC connection, statement etc
    public static void main(String[] args) {

	JdbcFacade jdbcFacade = new JdbcFacade();

	jdbcFacade.createTable();

	System.out.println("Table Created.");

	jdbcFacade.insertIntoTable();

	System.out.println("Record inserted.");

	List<Address> addresses = jdbcFacade.getAddress();

	for (Address address : addresses) {
	    System.out.println(address.getId() + " " + address.getStreetName() + " " + address.getCity());
	}
    }
}
