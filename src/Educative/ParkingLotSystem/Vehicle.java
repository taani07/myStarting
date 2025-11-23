package Educative.ParkingLotSystem;

abstract public class Vehicle {
    String LicensePlate;
    VehicleSize size;

    public Vehicle(String LicensePlate, VehicleSize size)
    {
        this.LicensePlate = LicensePlate;
        this.size = size;
    }
}

class Car extends Vehicle{
    public Car(String LicensePlate)
    {
        super(LicensePlate,VehicleSize.MEDIUM);

    }
}

class Bike extends Vehicle{
    public Bike(String LicensePlate)
    {
        super(LicensePlate, VehicleSize.SMALL);
    }
}

class Truck extends Vehicle {
    public Truck(String LicensePlate){
        super(LicensePlate,VehicleSize.LARGE);
    }


}
