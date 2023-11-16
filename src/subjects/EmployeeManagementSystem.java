package subjects;

import domain.Employee;
import domain.EmployeeDAO;
import observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject{

    private Employee employee;
    private EmployeeDAO employeeDAO;
    private String msg = null;
    private List<Employee> employees;
    private List<IObserver> observers;

    public EmployeeManagementSystem() {
        observers = new ArrayList<IObserver>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }

    // vi ska göra två metoder här inne senare
    // 1. modifiera namnet på en anställd
    // 2. anställa en ny person

    public void modifyEmployeeName(int id, String newName) {
        boolean notify = false;
        for (Employee emp : employees) {
            if (id == emp.employeeID) {
                emp.setName(newName);
                this.employee = emp;
                this.msg = "Employee name changed";
                notify = true;
            }
        }
        if (notify) {
            notifyObservers();
        }
    }

    public void hireNewEmployee(Employee employee) {
        this.employee = employee;
        this.msg = "New hire";
        notifyObservers();
    }

    @Override
    public void registerObserver(IObserver addMe) {
      // observers som läggs till i listan det är som som är
      // intresserade av att bli informerade
      observers.add(addMe);
    }

    @Override
    public void removeObserver(IObserver removeMe) {
        int removeIndex = observers.indexOf(removeMe);
        observers.remove(removeIndex);
    }

    @Override
    public void notifyObservers() {
        for (IObserver department : observers) {
            department.callMe(employee, msg);
        }
    }











}
