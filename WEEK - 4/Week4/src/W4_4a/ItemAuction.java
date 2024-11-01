package W4_4a;

import java.util.ArrayList;

public class ItemAuction implements AuctionSubject {
    private ArrayList<AuctionObserver> observers;
    private String item;
    private String auctionStatus;

    public ItemAuction(String item) {
        this.item = item;
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(AuctionObserver o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(AuctionObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (AuctionObserver o : observers) {
            o.update(auctionStatus);
        }
    }

    public void setAuctionStatus(String auctionStatus) {
        this.auctionStatus = auctionStatus;
        notifyObservers();
    }

    public String getItem() {
        return this.item;
    }
}