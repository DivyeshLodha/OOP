package Abstraction;

public class Cat2 extends Cat {

   //provide implementation of abstract method

    void makeSound(){
        System.out.println("meowww");
    }

    public static void main(String[] args) {
        Cat2 cat = new Cat2();
    cat.makeSound();
    cat.eat();
    }

}
