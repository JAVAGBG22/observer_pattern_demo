package domain;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    Employee emp1 = new Employee("Nisse", null, 10000, false);
    Employee emp2 = new Employee("Janne", null, 45000, false);
    Employee emp3 = new Employee("Doris", null, 30000, false);
    Employee emp4 = new Employee("Tore", null, 25000, false);
    Employee emp5 = new Employee("Janne-Nisse", null, 12000, false);

    List<Employee> employees;

    public List<Employee> generateEmployees(){

        employees = new ArrayList<Employee>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        return employees;

    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }

}


