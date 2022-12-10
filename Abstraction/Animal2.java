package Abstraction;

public class Animal2 extends Animal {

   public void animalSound(){
       System.out.println("wee-wee-wee");
    }

    public static void main(String[] args) {
        Animal2 animal = new Animal2();
        animal.animalSound();
        animal.sleep();
    }

}
