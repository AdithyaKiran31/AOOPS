package W2_2b;

public class RideBooking {
    private Customer customer;
    private Vehicle vehicle;

    public RideBooking(Customer customer, Vehicle vehicle) {
        this.customer = customer;
        this.vehicle = vehicle;
    }

    public void bookRide() {
        System.out.println();
        System.out.println("Your ride :" + vehicle.getVehicleType() + "\n"+" shared : " + customer.isRideShared() +"\n"+
                " from : " + customer.getPickupLocation()+"\n" + " to : " + customer.getDropLocation() +"\n"+ " Your Ride Will be arriving soon.........");
                System.out.println();
                System.out.println();
    }
}