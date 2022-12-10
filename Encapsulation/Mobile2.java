package Encapsulation;

public class Mobile2 {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        mobile.setBrand("Samsung");
        mobile.setPrice(12499);

        System.out.println(mobile.getBrand()+ " \t" + mobile.getPrice());
    }
}
