import java.util.*;
class VolumeCalculator {
    void calculateVolume(double side) {
        double volume = side * side * side;
        System.out.println("Volume of Cube = " + volume);
    }

    void calculateVolume(double length, double width, double height) {
        double volume = length * width * height;
        System.out.println("Volume of Rectangular Cube = " + volume);
    }

    void calculateVolume(float radius) {
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Sphere = " + volume);
    }
}
public class p12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator vc = new VolumeCalculator();

        System.out.println("Choose Shape:");
        System.out.println("1. Cube");
        System.out.println("2. Rectangular Cube");
        System.out.println("3. Sphere");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter side of cube: ");
                double side = sc.nextDouble();
                vc.calculateVolume(side);
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter width: ");
                double w = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                vc.calculateVolume(l, w, h);
                break;

            case 3:
                System.out.print("Enter radius: ");
                float r = sc.nextFloat();
                vc.calculateVolume(r);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}