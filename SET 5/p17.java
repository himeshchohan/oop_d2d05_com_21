    import java.util.*;
    interface Exam {
        boolean isPassed(int mark);
    }

    interface Classify {
        String getDivision(double average);
    }

    class Result implements Exam, Classify {
        public boolean isPassed(int mark) {
            return mark >= 40;
        }

        public String getDivision(double average) {
            if (average >= 60) {
                return "First Division";
            } 
            else if (average >= 50) {
                return "Second Division";
            } 
            else if (average >= 40) {
                return "Third Division";
            } 
            else {
                return "Fail";
            }
        }
    }

    public class p17 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Result r = new Result();
            System.out.print("Enter marks for sub 1: ");
            int marks1 = sc.nextInt();
            System.out.print("Enter marks for sub 2: ");
            int marks2 = sc.nextInt();
            System.out.print("Enter marks for sub 3: ");
            int marks3 = sc.nextInt();

            double avg = (marks1 + marks2 + marks3) / 3.0;

            if (r.isPassed(marks1) && r.isPassed(marks2) && r.isPassed(marks3)) {
                System.out.println("Result: Passed");
            } 
            else {
                System.out.println("Result: Failed");
            }

            String division = r.getDivision(avg);
            System.out.println("Average: " + avg);
            System.out.println("Division: " + division);
        }
    }