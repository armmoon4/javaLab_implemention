package lab3;

public class Student {
    String name;
    int id ;
    static String deprt ="CSE";
    Student(String n , int  i ){
        name = n ;
        id = i ;
    }
    void show(){
        System.out.println("Name: " +name);
        System.out.println("ID: " +id);
        System.out.println("Department: "+ deprt);
    }
}
