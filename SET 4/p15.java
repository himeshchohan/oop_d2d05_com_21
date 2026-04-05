import java.util.*;
class Employee {
    String name;
    String department;

    Scanner sc = new Scanner(System.in);
    void getDetails() {
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }
    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;
    @Override
    void displayDetails() {
        System.out.println("\n--- Manager Details ---");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
    void getManagerDetails() {
        getDetails();

        System.out.print("Enter Team Size: ");
        teamSize = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Project Name: ");
        projectName = sc.nextLine();
    }
}

public class p15 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getDetails();
        e.displayDetails();

        Manager m = new Manager();
        m.getManagerDetails();
        m.displayDetails();

        System.out.println("\n--- Runtime Polymorphism Demo ---");
        Employee ref;

        ref = new Employee();
        ref.getDetails();
        ref.displayDetails();

        ref = new Manager();
        ((Manager) ref).getManagerDetails();
        ref.displayDetails();
    }
}