package Abstraction;

public abstract class CustomLIst {
    int a = 100;
    static int b=200;
    {
        System.out.println("Instance block");
    }
    static {
        System.out.println("Static Block");
    }
    void m1(){
        System.out.println("Instance method");
    }
    static void m2(){
        System.out.println("Static method");
    }

    //Everything From concrete class + Abstract class

    abstract boolean add(Object object);

    public CustomLIst(){
        System.out.println("Abstract class constructor");
    }
    class Inner{}
    static class NestedClass{}

    public static void main(String[] args) {
        System.out.println("Main method in abstract class");

    }




}


