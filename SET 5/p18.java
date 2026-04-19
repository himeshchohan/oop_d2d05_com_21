abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {
    String fuelType() {
        return "Petrol/Diesel";
    }
    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {
    String fuelType() {
        return "Petrol";
    }
    int noOfWheels() {
        return 2;
    }
}

public class p18 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        System.out.println("--- Car Details ---");
        System.out.println("Fuel Type: " + v1.fuelType());
        System.out.println("Number of Wheels: " + v1.noOfWheels());

        System.out.println("\n--- Bike Details ---");
        System.out.println("Fuel Type: " + v2.fuelType());
        System.out.println("Number of Wheels: " + v2.noOfWheels());
    }
}