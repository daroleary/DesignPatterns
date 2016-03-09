package creational.adapter;

/**
 * Adapter
 *
 * This class takes in the original class and effectively
 * masquerades it into an Employee since we implement
 * Employee and override all its methods.
 */
public class EmployeeAdapterLdap implements Employee {

    private final EmployeeLdap instance;

    @Override
    public int hashCode() {
        return instance != null ? instance.hashCode() : 0;
    }

    public EmployeeAdapterLdap(EmployeeLdap employeeFromLdap) {
        instance = employeeFromLdap;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmployeeAdapterLdap)) {
            return false;
        }

        EmployeeAdapterLdap that = (EmployeeAdapterLdap) o;

        return instance != null ? instance.equals(that.instance) : that.instance == null;
    }
}
