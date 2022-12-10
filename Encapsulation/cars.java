package Encapsulation;

public class cars {

    public static void main(String[] args) {

        Car car =new Car();

        car.setId(1);
        car.setName("BMW");

        System.out.println(car.getId()+" "+ car.getName()   );
    }
}
