package midterm;

public class Student {
    private String id ;
    private String name;
    private double cgpa;
    public void insert_Record(String id , String name , double cgpa) {
        this.id = id ;
        this.name = name ;
        this.cgpa = cgpa ;
    }

    public void display_record()
    {
        System.out.println("Name: "+name);
        System.out.println("ID:" +id);
        System.out.println("CGPA:"+cgpa);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.insert_Record("213-15-4343" , "Abdur Rahman Moon" , 3.90);
        s1.display_record();

    }

}
