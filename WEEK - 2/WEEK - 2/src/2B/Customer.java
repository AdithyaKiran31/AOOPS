package W2_2b;

public class Customer {
    private String userName;
    private int userId;
    private String pickupLocation;
    private String dropLocation;
    private boolean isRideShared;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public boolean isRideShared() {
        return isRideShared;
    }

    public void setRideShared(boolean rideShared) {
        isRideShared = rideShared;
    }
}