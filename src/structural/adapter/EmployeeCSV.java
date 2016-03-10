package structural.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {

    private int _id;
    private String _firstName;
    private String _lastName;
    private String _emailAddress;

    public EmployeeCSV(String values) {

	StringTokenizer tokenizer = new StringTokenizer(values, ",");
	if (tokenizer.hasMoreElements()) {
	    _id = Integer.parseInt(tokenizer.nextToken());
	}

	if (tokenizer.hasMoreElements()) {
	    _firstName = tokenizer.nextToken();
	}

	if (tokenizer.hasMoreElements()) {
	    _lastName = tokenizer.nextToken();
	}

	if (tokenizer.hasMoreElements()) {
	    _emailAddress = tokenizer.nextToken();
	}
    }

    public int getId() {
	return _id;
    }

    public String getFirstName() {
	return _firstName;
    }

    public String getLastName() {
	return _lastName;
    }

    public String getEmailAddress() {
	return _emailAddress;
    }
}
