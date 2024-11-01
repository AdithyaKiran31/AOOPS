package W2_2b;

public class Bike implements Vehicle {
    private String vehicleType;

    public Bike() {
        this.vehicleType = "bike";
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public void vehicletype() {
        System.out.println("You have chosen a bike");
    }
}