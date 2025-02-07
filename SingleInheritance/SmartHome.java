class Device {
    String deviceId;
    boolean status; // true for on, false for off

    public Device(String deviceId) {
        this.deviceId = deviceId;
        this.status = false; // Initially off
    }

    public void turnOn() {
        this.status = true;
        System.out.println(deviceId + " turned ON.");
    }

    public void turnOff() {
        this.status = false;
        System.out.println(deviceId + " turned OFF.");
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    public Thermostat(String deviceId, double temperatureSetting) {
        super(deviceId); // Call the superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    public void setTemperature(double temperature) {
        this.temperatureSetting = temperature;
        System.out.println(deviceId + ": Temperature set to " + temperature + " degrees.");
    }

    @Override
    public void displayStatus() {
        super.displayStatus(); // Call the superclass displayStatus()
        System.out.println("Temperature Setting: " + temperatureSetting + " degrees");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Thermostat livingRoomThermostat = new Thermostat("thermostat001", 22.0);

        livingRoomThermostat.displayStatus(); // Initial status
        System.out.println("--------------------");

        livingRoomThermostat.turnOn();
        livingRoomThermostat.setTemperature(24.5);
        livingRoomThermostat.displayStatus();
        System.out.println("--------------------");

        livingRoomThermostat.turnOff();
        livingRoomThermostat.displayStatus();
    }
}