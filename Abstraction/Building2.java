package Abstraction;

public class Building2 extends Building {

//    public static void main(String[] args) {



    @Override
    String name() {
        System.out.println("Elon");
        return null;
    }

    @Override
    int number() {
        System.out.println(12);
        return 0;
    }

    public static void main(String[] args) {

        Building2 building2 =new Building2();
        building2.name();
        building2.number();
    }
    }

