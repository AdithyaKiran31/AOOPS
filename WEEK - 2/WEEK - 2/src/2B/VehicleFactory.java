package W2_2b;

public class VehicleFactory {
    public static Vehicle getInstance(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("cab")) {
            return new Cab();
        } else if (vehicleType.equalsIgnoreCase("bike")) {
            return new Bike();
        } else if (vehicleType.equalsIgnoreCase("auto")) {
            return new Auto();
        } else {
            return null;
        }
    }   
}
