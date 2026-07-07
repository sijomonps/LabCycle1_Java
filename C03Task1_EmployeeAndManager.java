//Date: 07/07/25
class Employee{

    int employeeId;
    String employeeName;
    int salary;

    //Constructor
    Employee(){
        employeeId = 101;
        employeeName = "Arun";
        salary = 50000;
    }
    void displayEmployee() {
        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("Employee Id: "+ employeeId);
        System.out.println("Employee Name: "+ employeeName);
        System.out.println("Employee Salary: "+ salary);
    }
}

class Manager extends Employee{
    String department;
    int bonus;

    // Constructor
    Manager() {
        department = "Sales";
        bonus = 15000;
    }

    void displayManager(){
        System.out.println("Manager  Details");
        System.out.println("----------------");
        System.out.println("Employee Salary: "+ department);
        System.out.println("Employee Salary: "+ bonus);
    }
}

public class C03Task1_EmployeeAndManager {
    public static void main(String[] args){
        Manager m = new Manager();

        m.displayEmployee();
        m.displayManager();

    }
}
