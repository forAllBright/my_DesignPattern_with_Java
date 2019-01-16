package observer_pattern;

public interface Sstock {
    public void addBuyer(Buyer buyer);
    public void deleBuyer(Buyer buyer);
    public void notifyBuyer();
}
