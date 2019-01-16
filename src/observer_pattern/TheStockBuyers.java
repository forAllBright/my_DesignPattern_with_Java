package observer_pattern;

public class TheStockBuyers implements Buyer{
    Sstock stock;
    int flag;

    public TheStockBuyers(Thestock stock, int flag){
        this.stock = stock;
        this.flag = flag;
    }

    @Override
    public void update() {
        if(this.stock instanceof Sstock) {
            System.out.println("客户 " + this + this.flag + "，您好，" + "股票下跌率为 " + ((Thestock)this.stock).getDownPriceRate());
        }
    }

    @Override
    public String toString() {
        return "股票买家";
    }
}
