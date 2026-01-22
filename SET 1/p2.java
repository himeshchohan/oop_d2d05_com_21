import java.util.*;

public class p2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coeeficent of A: ");
        double a = sc.nextDouble();

        System.out.println("Enter coeffient of B: ");
        double b = sc.nextDouble();

        System.out.println("Enter coeffient of C: ");
        double c = sc.nextDouble();

        System.out.println("Enter coeffient of D: ");
        double d = sc.nextDouble();

        System.out.println("Enter coeffient of E: ");
        double e = sc.nextDouble();

        System.out.println("Enter coeffient of F: ");
        double f = sc.nextDouble();

        double D = a*d - b*c;
        double Dx = e*d - b*f;
        double Dy = a*f - c*e;

        if(D==0){
            System.out.println("The system has denomiacer is zero");
        }
        else{
            double x = Dx / D;
            double y = Dy /D;

            System.out.println("Ans is ");
        System.out.println("X is: "+x);
        System.out.println("Y is: "+y);
        }
        
    }
}