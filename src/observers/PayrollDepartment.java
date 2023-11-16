package observers;

import domain.Employee;

public class PayrollDepartment implements IObserver{
    @Override
    public void callMe(Employee employee, String msg) {
        System.out.println("Payroll department notified");
        System.out.println(msg + ": " + employee.getName());
    }
}
