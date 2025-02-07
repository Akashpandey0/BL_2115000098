class Vehicle {
    int maxSpeed;
    String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }


    public void showDetails() {
        System.out.println("Max Speed: " + maxSpeed + " Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    int noOfSeats;

    public Car(int maxSpeed, String fuelType, int noOfSeats) {
        super(maxSpeed, fuelType);
        this.noOfSeats = noOfSeats;
    }


    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println(" No of Seats: " + noOfSeats);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }


    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println(" Load Capacity: " + loadCapacity);
    }
}

class MotorCycle extends Vehicle {
    String type;

    public MotorCycle(int maxSpeed, String fuelType, String type) {
        super(maxSpeed, fuelType);
        this.type = type;
    }


    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println(" Type: " + type);
    }
}
public class VehicleDemo {
   public static void main(String[] args) {
    Vehicle [] vehicles = new Vehicle[3];
    vehicles[0] = new Car(120, "Petrol", 4);
    vehicles[1] = new Truck(80, "Diesel", 1000);
    vehicles[2] = new MotorCycle(150, "Petrol", "Sports");
   } 
}
