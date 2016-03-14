package behavioural.momento;

import java.util.Stack;

// caretaker
public class Caretaker {

    private Stack<EmployeeMomento> _employeeHistory = new Stack<>();

    public void save(Employee employee) {
	_employeeHistory.push(employee.save());
    }

    public void revert(Employee employee) {
	employee.revert(_employeeHistory.pop());
    }
}
