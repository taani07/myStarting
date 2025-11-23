package Educative.ParkingLotSystem;

public class ParkingSpot {
    private final VehicleSize size;
    private Vehicle vehicle;

    public ParkingSpot(VehicleSize size)
    {
        this.size =size;
    }

    public boolean isAvailable()
    {
        return vehicle==null;
    }

    public boolean canFit(Vehicle vehicle )
    {
       return isAvailable() && vehicle.size.ordinal()<=this.size.ordinal();
    }
}
