package W2_2b;

public class Cab implements Vehicle {
    private String vehicleType;

    public Cab() {
        this.vehicleType = "cab";
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public void vehicletype() {
        System.out.println("You have chosen a cab");
    }
}