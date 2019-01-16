package observer_pattern;

import java.util.Random;

public class Main_Observer {
    public static void main(String[] args) {
        Thestock DemoStock = new Thestock();
        DemoStock.setBuyinprice(200.0f);
        TheStockBuyers Buyer1 = new TheStockBuyers(DemoStock, 1);
        TheStockBuyers Buyer2 = new TheStockBuyers(DemoStock, 2);
        TheStockBuyers Buyer3 = new TheStockBuyers(DemoStock, 3);

        DemoStock.addBuyer(Buyer1);
        DemoStock.addBuyer(Buyer2);
        DemoStock.addBuyer(Buyer3);

        for(int i = 0; i < 100; i++){
            Random rd = new Random();
            int rdnum = rd.nextInt(300);
            DemoStock.setNowprice(rdnum);
            DemoStock.timeToNotify();
            System.out.println("---------------------------------------------");
        }

    }
}




