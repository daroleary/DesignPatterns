package creational.adapter;

// Legacy code
public class EmployeeLdap {

    private String _cn;
    private String _surname;
    private String _givenName;
    private String _mail;

    public EmployeeLdap(String cn, String surname, String givenName, String mail) {
	_cn = cn;
	_surname = surname;
	_givenName = givenName;
	_mail = mail;
    }

    public String getCn() {
	return _cn;
    }

    public String getSurname() {
	return _surname;
    }

    public String getGivenName() {
	return _givenName;
    }

    public String getMail() {
	return _mail;
    }
}
