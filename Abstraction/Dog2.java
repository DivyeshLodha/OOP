package Abstraction;

public class Dog2 extends Dog{


    @Override
    void Sound() {
        System.out.println("Bhoo bhoo");
    }

    public static void main(String[] args) {

        Dog2 dog = new Dog2();
        dog.Sound();
    }
}
