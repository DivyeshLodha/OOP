package Polymorphism;

public class OverLoading5 {


            void add(){
                System.out.println("10+20 = 30");
        }
        void add(int x,int y){
            int D = x + y;
            System.out.println(D);
        }


    public static void main(String[] args) {
        OverLoading5 overLoading = new OverLoading5();
        overLoading.add();
        overLoading.add(10,20);
    }
    }

