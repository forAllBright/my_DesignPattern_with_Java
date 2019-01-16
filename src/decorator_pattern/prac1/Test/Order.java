package decorator_pattern.prac1.Test;

public class Order {
    public static void main(String[] args) {
        Piza pz = new HusPiza();
        pz = new Con1(pz);
//        ((Con1) pz).getDescription();
        System.out.println(pz.cost());
    }

}
