class Vehicle {
    String vehicleNumber;
    String brand;
    double speed;

    Vehicle(String vehicleNumber, String brand, double speed) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String vehicleNumber, String brand, double speed, int numberOfDoors) {
        super(vehicleNumber, brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayDetails() {
        System.out.println("Car");
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    Bike(String vehicleNumber, String brand, double speed, boolean hasGear) {
        super(vehicleNumber, brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    void displayDetails() {
        System.out.println("Bike");
        super.displayDetails();
        System.out.println("Has Gear: " + hasGear);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle;

        vehicle = new Car("TN01AB1234", "Toyota", 120, 4);
        vehicle.displayDetails();

        System.out.println();
        vehicle = new Bike("TN02CD5678", "Yamaha", 140, true);
        vehicle.displayDetails();
    }
}
