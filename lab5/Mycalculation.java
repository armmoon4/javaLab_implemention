package lab5;

public class Mycalculation extends Calculation {

    public void multiplication(int x , int y )
    {
        z = x * y ;
        System.out.println("Multiplication: "+z);
    }
    public void Division(int x  , int y )
    {
        z  = x/ y ;
        System.out.println("Division is: "+z);
    }

    public static void main(String[] args) {
        int a = 20 , b = 10 ;

        Mycalculation demo = new Mycalculation();
        demo.addition(a , b);
        demo.substraction(a , b);
        demo.multiplication(a , b );
        demo.Division(a , b );


    }
}
