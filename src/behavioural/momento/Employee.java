package behavioural.momento;

// originator
public class Employee  {

    private String _name;
    private String _address;
    private String _phone;

    public String getName() {
	return _name;
    }

    public void setName(String name) {
	_name = name;
    }

    public String getAddress() {
	return _address;
    }

    public void setAddress(String address) {
	_address = address;
    }

    public String getPhone() {
	return _phone;
    }

    public void setPhone(String phone) {
	_phone = phone;
    }

    public String toString() {
	return _name + " : " + _phone;
    }

    public EmployeeMomento save() {
	return new EmployeeMomento(_name, _phone);
    }

    public void revert(EmployeeMomento employeeMomento) {
	_name = employeeMomento.getName();
	_phone = employeeMomento.getPhone();
    }
}
