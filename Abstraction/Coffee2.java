package Abstraction;

public class Coffee2 extends Coffee {


    @Override
    int price() {
        System.out.println(1212);
        return 0;
    }

    @Override
    String name() {
        System.out.println("tea");
        return null;
    }

    public static void main(String[] args) {
        Coffee2 coffee2 = new Coffee2();
        coffee2.name();
        coffee2.price();
    }
}
