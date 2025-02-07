interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayVehicleInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    int batteryCapacity; // in kWh

    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    double fuelTankCapacity; // in liters

    public PetrolVehicle(int maxSpeed, String model, double fuelTankCapacity) {
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is being refueled.");
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle(250, "Tesla Model S", 100);
        PetrolVehicle toyota = new PetrolVehicle(200, "Toyota Camry", 60);

        tesla.displayVehicleInfo();
        tesla.charge();
        System.out.println("--------------------");

        toyota.displayVehicleInfo();
        toyota.refuel();
        System.out.println("--------------------");

        //Polymorphism with Interface
        Refuelable myRefuelable;

        myRefuelable = toyota;
        myRefuelable.refuel();
        System.out.println("--------------------");


        //Polymorphism with Class
        Vehicle myVehicle;

        myVehicle = tesla;
        myVehicle.displayVehicleInfo();
        System.out.println("--------------------");

        myVehicle = toyota;
        myVehicle.displayVehicleInfo();
        System.out.println("--------------------");


    }
}