package creational.adapter;

public class EmployeeAdapterCSV implements Employee {

    private final EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV employeeFromCSV) {
        instance = employeeFromCSV;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    @Override
    public String toString() {
        return "Employee {" +
               "_id='" + getId() + '\'' +
               ", _firstName='" + getFirstName() + '\'' +
               ", _lastName='" + getLastName() + '\'' +
               ", _email='" + getEmail() + '\'' +
               '}';
    }
}
