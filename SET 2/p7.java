import java.util.*;
class Employee{
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData(){
        System.out.println("Employee Details: ");
        System.out.println("Name: " +employeeName);
        System.out.println("Salary: " +employeeSalary);
    }
}

public class p7{
    public static void main(String args[]){
        Employee emp = new Employee();
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}