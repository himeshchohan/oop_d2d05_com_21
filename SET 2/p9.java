import java.util.*;
class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width of Rectangle 1:");
        double width1 = sc.nextDouble();
        System.out.println("Enter height of Rectangle 1:");
        double height1 = sc.nextDouble();
        Rectangle r1 = new Rectangle(width1, height1);

        System.out.println("Enter width of Rectangle 2:");
        double width2 = sc.nextDouble();
        System.out.println("Enter height of Rectangle 2:");
        double height2 = sc.nextDouble();
        Rectangle r2 = new Rectangle(width2, height2);

        System.out.println("Rectangle 1:");
        System.out.println("Width: " + r1.width);
        System.out.println("Height: " + r1.height);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println();
        System.out.println("Rectangle 2:");
        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        System.out.println();
        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (r1.getArea() < r2.getArea()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }
    }
}