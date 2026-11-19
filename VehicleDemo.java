class Vehicle {
    String brand;
    int year;

    // Constructor
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void showInfo() {
        System.out.println("Vehicle: " + brand + " (" + year + ")");
    }

    // Overloaded method 1: base fare by distance
    public double calculateFare(double distanceKm) {
        return distanceKm * 10.0;
    }

    // Overloaded method 2: fare with distance and peak-hour surcharge
    public double calculateFare(double distanceKm, double surcharge) {
        return (distanceKm * 10.0) + surcharge;
    }
}

// Child class inheriting from Vehicle
class Bike extends Vehicle {
    boolean hasDiscBrake;

    Bike(String brand, int year, boolean hasDiscBrake) {
        super(brand, year); // Calls parent constructor
        this.hasDiscBrake = hasDiscBrake;
    }

    public void showBikeSpecs() {
        showInfo();
        System.out.println("Disc Brake: " + (hasDiscBrake ? "Yes" : "No"));
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Bike myBike = new Bike("TVS", 2024, true);
        myBike.showBikeSpecs();

        System.out.println("Standard Fare (15 km): ₹" + myBike.calculateFare(15));
        System.out.println("Peak Fare (15 km + ₹25): ₹" + myBike.calculateFare(15, 25.0));
    }
}