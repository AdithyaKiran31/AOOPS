package W4_4a;

public class Bidder implements AuctionObserver {
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String auctionStatus) {
        String emoji = "";
        if (auctionStatus.contains("available")) {
            emoji = " items available";
        } else if (auctionStatus.contains("started")) {
            emoji = "bidding started";
        } else if (auctionStatus.contains("ended")) {
            emoji = "auction ended";
        }
        System.out.println("[" + name + "] Update: " + emoji + " " + auctionStatus);
    }
}