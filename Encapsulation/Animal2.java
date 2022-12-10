package Encapsulation;

public class Animal2 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setCity("Pune");
        animal.setName("Tiger");

        System.out.println(animal.getCity() +" " + animal.getName());
    }
}
