package structural.facade;

import java.sql.Connection;

// Example class
public class DbSingleton {
    private static DbSingleton instance;
    private Connection _connection;

    public static DbSingleton getInstance() {
	return instance;
    }

    public Connection getConnection() {
	return _connection;
    }
}
