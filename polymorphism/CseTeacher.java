package polymorphism;

public class CseTeacher extends Teacher {

    String mainSub = "CSE" ;

    public static void main(String[] args) {

        CseTeacher x = new CseTeacher() ;

        System.out.println(x.designation);
        System.out.println(x.uniName);
        System.out.println(x.mainSub);
        x.job();

    }



}
