package methodOverriding;

public class Bike extends Vehicle {

    void  run(){
        System.out.println("BIke is Running Safely");
    }

    public static void main(String[] args) {
        Bike s2 = new Bike() ;

        s2.run();

    }


}
