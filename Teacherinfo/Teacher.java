package Teacherinfo ;
public class Teacher {
    String name , department ;
    int age;

    Teacher() {
        System.out.println("For checking ");
    }
    Teacher(String a , String b ){
        name = a  ;
        department = b ;

    }
    Teacher(String x , String y , int z )
    {
        name = x  ;
        department = y ;
        age = z ;

    }
    void display()
    {
        System.out.println("Your name is: " +name);
        System.out.println("Your Department is: " +department);
        System.out.println("Your age is: " +age);
    }


}