package observer_pattern.prac1_stockbuyer;

public interface Sstock {
    public void addBuyer(Buyer buyer);
    public void deleBuyer(Buyer buyer);
    public void notifyBuyer();
}
