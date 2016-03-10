package structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    private DbSingleton instance = null;

    public JdbcFacade() {
	instance = DbSingleton.getInstance();
    }

    public int createTable() {
	int count = 0;
	try {
	    Connection conn = instance.getConnection();

	    Statement sta = conn.createStatement();
	    count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName "
				      + "VARCHAR(20), City VARCHAR(20))");

	    sta.close();
	    conn.close();
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	return count;
    }

    public int insertIntoTable() {
	int count = 0;
	try {
	    Connection conn = instance.getConnection();
	    Statement sta = conn.createStatement();
	    count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City) "
				      + "values (1, '1234 Some Street', 'Layton')");
	    sta.close();
	    conn.close();
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	return count;
    }

    public List<Address> getAddress() {
	List<Address> addresses = new ArrayList<>();

	try {
	    Connection conn = instance.getConnection();

	    Statement sta = conn.createStatement();
	    ResultSet rs = sta.executeQuery("SELECT * FROM Address");

	    while (rs.next()) {
		String id = rs.getString(1);
		String streetName = rs.getString(2);
		String city = rs.getString(3);

		System.out.println(id + " " + streetName + " " + city);
		addresses.add(new Address(id, streetName, city));
	    }

	    sta.close();
	    conn.close();
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	return addresses;
    }
}
