package behavioural.momento;

// momento
public class EmployeeMomento {

    private String _name;
    private String _phone;

    public EmployeeMomento(String name, String phone) {
	_name = name;
	_phone = phone;
    }

    public String getName() {
	return _name;
    }

    public String getPhone() {
	return _phone;
    }
}
