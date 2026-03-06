import java.util.*;

class College {
    String collegeName;
    College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        String studentName;
        String course;

        Scanner sc = new Scanner(System.in);
        void acceptDetails() {
            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();
            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }  
}
public class p11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter College Name: ");
        String cname = sc.nextLine();
        College college = new College(cname);

        College.Admission admission = college.new Admission();
        admission.acceptDetails();
        admission.displayDetails();
    }
}