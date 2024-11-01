package W2_2b;

import java.util.Scanner;

public class RideBookingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.println("Enter name and id to login");
        customer.setUserName(input.nextLine());
        customer.setUserId(input.nextInt());
        input.nextLine();
        System.out.println("Enter vehicle type: cab, bike, or auto");
        String vehicleOption = input.nextLine();
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = factory.getInstance(vehicleOption);
        vehicle.vehicletype();
        System.out.println("Enter source and destination");
        customer.setPickupLocation(input.nextLine());
        customer.setDropLocation(input.nextLine());
        System.out.println("Enter true to share ride, else enter false");
        customer.setRideShared(input.nextBoolean());
        RideBooking rideBooking = new RideBooking(customer, vehicle);
        rideBooking.bookRide();
        input.close();
    }
}
