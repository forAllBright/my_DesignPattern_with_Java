package decorator_pattern.prac1.Test;

public class Con1 implements Piza{
    Piza piza;

    public Con1(Piza piza){
        this.piza = piza;
    }

//    @Override
//    public void getDescription() {
//        System.out.printf("add Con1\n");
//    }

    @Override
    public double cost() {
        return 0.2 + this.piza.cost();
    }
}
