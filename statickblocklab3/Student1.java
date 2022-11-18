package statickblocklab3;

public class Student1 {
    static String dname ;
    static int id ;


    static {
        dname = " CSE" ;
        id = 4343 ;

        System.out.println("Welcome Moon");
        System.out.println("Almost There");
    }
    static void display() {
        System.out.println("Your Department is: "+dname);
        System.out.println("Your ID is: "+id);


    }

}
