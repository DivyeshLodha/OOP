package Polymorphism;

public class OverLoading3 {

    public void add(){
        int a=10;
        int b=20;
        int c;
        c=a+b;

        System.out.println(c);

    }
    public void add(String name){
        System.out.println(name);
    }
}
