package methodOverriding;

public class Bikesup extends Vehcilesup {

    int speed = 100 ;
    void display() {
        System.out.println(super.speed);
    }


    public static void main(String[] args) {

        Bikesup b = new Bikesup();

        b.display();

    }

}
