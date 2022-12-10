package Abstraction;

public class AA extends  Abs {

    void hello(){
        System.out.println("Hii");
        }
      public   String name() {
          System.out.println("Hii");

          return null;
      }
    public static void main(String[] args) {
        AA b = new AA();

        b.name();
        b.hello();
    }
}
