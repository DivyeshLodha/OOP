package Encapsulation;

public class Coffee2 {

    public static void main(String[] args) {

        Coffee coffee = new Coffee();

        coffee.setPrice(750);
        coffee.setFlavour("Chocolate");

        System.out.println(" "+coffee.getFlavour()+" "+ coffee.getPrice() );
    }
}
