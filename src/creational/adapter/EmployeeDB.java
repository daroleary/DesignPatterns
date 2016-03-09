package creational.adapter;

public class EmployeeDB implements Employee {

    private String _id;
    private String _firstName;
    private String _lastName;
    private String _email;

    public EmployeeDB(String id, String firstName, String lastName, String email) {
	_id = id;
	_firstName = firstName;
	_lastName = lastName;
	_email = email;
    }

    public String getId() {
	return _id;
    }

    public String getFirstName() {
	return _firstName;
    }

    public String getLastName() {
	return _lastName;
    }

    public String getEmail() {
	return _email;
    }

    @Override
    public String toString() {
	return "EmployeeDB{" +
	       "_id='" + _id + '\'' +
	       ", _firstName='" + _firstName + '\'' +
	       ", _lastName='" + _lastName + '\'' +
	       ", _email='" + _email + '\'' +
	       '}';
    }

    @Override
    public boolean equals(Object o) {
	if (this == o) {
	    return true;
	}
	if (o == null || getClass() != o.getClass()) {
	    return false;
	}

	EmployeeDB that = (EmployeeDB) o;

	if (_id != null ? !_id.equals(that._id) : that._id != null) {
	    return false;
	}
	if (_firstName != null ? !_firstName.equals(that._firstName) : that._firstName != null) {
	    return false;
	}
	if (_lastName != null ? !_lastName.equals(that._lastName) : that._lastName != null) {
	    return false;
	}
	return _email != null ? _email.equals(that._email) : that._email == null;

    }

    @Override
    public int hashCode() {
	int result = _id != null ? _id.hashCode() : 0;
	result = 31 * result + (_firstName != null ? _firstName.hashCode() : 0);
	result = 31 * result + (_lastName != null ? _lastName.hashCode() : 0);
	result = 31 * result + (_email != null ? _email.hashCode() : 0);
	return result;
    }
}
