import java.util.*;
class Shape {
    double d1, d2;
    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    double area() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {
    double area() {
        return d1 * d2;
    }
}

public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base and height of Triangle: ");
        double t1 = sc.nextDouble();
        double t2 = sc.nextDouble();

        Triangle t = new Triangle();
        t.getData(t1, t2);
        System.out.println("Area of Triangle = " + t.area());

        System.out.print("\nEnter length and breadth of Rectangle: ");
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();

        Rectangle r = new Rectangle();
        r.getData(r1, r2);
        System.out.println("Area of Rectangle = " + r.area());
    }
}
