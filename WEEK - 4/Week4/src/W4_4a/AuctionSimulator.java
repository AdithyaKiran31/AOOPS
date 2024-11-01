package W4_4a;

public class AuctionSimulator {
    public static void main(String[] args) {
        ItemAuction auction = new ItemAuction("Vintage Watch");
        Bidder participant1 = new Bidder("Alice");
        Bidder participant2 = new Bidder("Bob");

        auction.registerObserver(participant1);
        auction.registerObserver(participant2);

        auction.setAuctionStatus("The item '" + auction.getItem() + "' is now available for bidding.");

        auction.setAuctionStatus("Bidding has officially started!");

        auction.unregisterObserver(participant2);

        auction.setAuctionStatus("The bidding has ended.");
    }
}