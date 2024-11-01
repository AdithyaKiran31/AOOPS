package W4_4a;

public interface AuctionSubject {
    void registerObserver(AuctionObserver o);
    void unregisterObserver(AuctionObserver o);
    void notifyObservers();
}