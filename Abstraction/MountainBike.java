package Abstraction;

public class MountainBike extends SportsBIke {

    public void colour(){
        System.out.println("Red");
    }
    public void price(){
        System.out.println(12121);
    }

    public static void main(String[] args) {

        MountainBike mountainBike = new MountainBike();
        mountainBike.brand();
        mountainBike.colour();

//        object of SportsBike
        SportsBIke sportsBIke =new SportsBIke();
        sportsBIke.price();
        sportsBIke.colour();

    }

}
