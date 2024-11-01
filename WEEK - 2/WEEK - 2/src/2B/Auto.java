package W2_2b;

public class Auto implements Vehicle {
    private String vehicleType;

    public Auto() {
        this.vehicleType = "auto";
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public void vehicletype() {
        System.out.println("You have chosen an auto");
    }
}
