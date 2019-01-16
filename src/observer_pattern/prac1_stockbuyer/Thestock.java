package observer_pattern.prac1_stockbuyer;

import java.util.ArrayList;

public class Thestock implements Sstock {
    ArrayList<Buyer> buyerList = new ArrayList<>();
    private float buyinprice;
    private float nowprice;

    @Override
    public void addBuyer(Buyer buyer) {
        buyerList.add(buyer);
    }

    @Override
    public void deleBuyer(Buyer buyer) {
        buyerList.remove(buyer);
    }

    @Override
    public void notifyBuyer() {
        for (Buyer buyer:buyerList
        ) {
            buyer.update();
        }
    }

    public void timeToNotify(){
        if (this.buyinprice - this.nowprice >= this.buyinprice*0.05){
            System.out.println("通知：");
            this.notifyBuyer();
        } else {
            System.out.println("*****************/未启用通知/*******************");
        }
    }

    public float getDownPriceRate(){
        return (this.buyinprice - this.nowprice)/this.buyinprice;
    }

    public void setNowprice(float nowPrice){
        this.nowprice = nowPrice;
    }

    public void setBuyinprice(float buyingPrice){
        this.buyinprice = buyingPrice;
    }
}