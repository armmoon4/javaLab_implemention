package polymorphism;

public class Mycalculation extends Calculation {

    public void multiplication( int x  , int y) {
        z = x * y ;
        System.out.println("Multiplicayion is : "+z );
    }

    public void division(int x , int  y)
    {
        z  = x / y ;
        System.out.println("Division is : "+z);
    }

    public static void main(String[] args) {

        int a = 5 , b = 5 ;

        Mycalculation demo = new Mycalculation() ;

        demo.addition(a , b);
        demo.substraction(a , b);
        demo.multiplication(a ,  b );
        demo.division(a  , b);


    }


}
