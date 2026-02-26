import java.util.*;
class Rectangle{
    private double width = 1;
    private double height = 1;

    public Rectangle() {
    }

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double gerPerimeter(){
        return 2* (width + height);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
public class p6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        Rectangle r = new Rectangle(width, height);

        System.out.println("Rectangle Area is: " + r.getArea());
        System.out.println("Rectangle Perimeter is: " + r.gerPerimeter());
    }
}