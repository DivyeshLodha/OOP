package Encapsulation;

public class Laptop2 {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();

        laptop.setBrand("DELL");
        laptop.setPrice(75000);

        System.out.println(laptop.getBrand() + " " + laptop.getPrice());

    }
}
