package Lab4;

public class constarctorOverloading {
    private int height  , weidth ;

    public constarctorOverloading() {
        height = 10 ;
        weidth = 15 ;
    }
    public constarctorOverloading(int height , int weidth)
    {
        this.height = height ;
        this.weidth  = weidth ;
    }

    public static void main(String[] args) {
        constarctorOverloading b1 = new constarctorOverloading() ;
        constarctorOverloading b2 = new constarctorOverloading(20 , 30);
        constarctorOverloading b3 = new constarctorOverloading(50 , 60);
        constarctorOverloading b4 = new constarctorOverloading() ;

        System.out.println("For Box-1: Height "+b1.height+" Widht = "+b1.weidth);
        System.out.println("For Box-2: Height "+b2.height+" Widht = "+b2.weidth);
        System.out.println("For Box-3: Height "+b3.height+" Widht = "+b3.weidth);
        System.out.println("For Box-4: Height "+b4.height+" Widht = "+b4.weidth);


    }
}
