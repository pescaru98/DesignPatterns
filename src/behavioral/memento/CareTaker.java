package behavioral.memento;

import java.util.Stack;

/**
 * This ia "CareTaker".
 * There are multiple implementations
 */
public class CareTaker {
    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee emp) {
        employeeHistory.push(emp.save());
    }

    public void revert(Employee emp) {
        emp.revert(employeeHistory.pop());
    }
}
