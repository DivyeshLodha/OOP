package Abstraction;

public class Hello2 extends Hello {


    public void name(){
        System.out.println("java");
    }
    public void lastName(){
        System.out.println("Developer");
    }

    public static void main(String[] args) {

        Hello2 hello = new Hello2();
        hello.name();
        hello.lastName();

    }


}
