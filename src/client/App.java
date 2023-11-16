package client;

import observers.HRDepartment;
import observers.IObserver;
import observers.PayrollDepartment;
import subjects.EmployeeManagementSystem;

public class App {
    public static void main(String[] args) {
        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        // först registrera observers
        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

        //Employee helena = new Employee("Helena", new Date(), 15000, true);
        //ems.hireNewEmployee(helena);

        // ändra namn på befintlig anställd
        ems.modifyEmployeeName(2, "Test-namn");
    }
}

















