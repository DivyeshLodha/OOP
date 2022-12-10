package Encapsulation;

public class Dmart2 {
    public static void main(String[] args) {

        Dmart dmart = new Dmart();

        dmart.setCity("Pune");
        dmart.setLocation("Deccan");
        dmart.setNo(1);

        System.out.println( " " +dmart.getCity()+ " \n " +dmart.getLocation()+ "\n " + dmart.getNo());



    }
}
