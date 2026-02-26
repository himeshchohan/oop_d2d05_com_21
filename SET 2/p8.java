class point{
    private int x;
    private int y;

    point(){
        x = 5;
        y = 5;
    }
    point(int x, int y){
        this.x = x;
        this.y = y;
    }
    point(point p){
        this.x = p.x;
        this.y = p.y;
    }
    void display(){
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

public class p8{
    public static void main(String args[]){
        point p1 = new point();
        System.out.println("Default constructor: ");
        p1.display();

        point p2 = new point(10, 20);
        System.out.println("Parameteriazed constructor: ");
        p2.display();

        point p3 = new point(p2);
        System.out.println("copy constructor: ");
        p3.display();

    }
}