package midterm;

public class Student1 {
    private String name ;
    private int id ;
    private double cgpa;

    public void Student(String name, int id , double cgpa)
    {
        this.name = name;
        this.id = id ;
        this.cgpa = cgpa ;
    }
    public void setName(String name1)
    {
        this.name = name1 ;
    }
    public void setId(int id1)
    {
        this.id = id1 ;
    }
    public void setCgpa(double cgpa1)
    {
        this.cgpa  = cgpa1 ;
    }

    public String getName() {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public double getCgpa() {
        return cgpa  ;
    }

    public void displat() {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("CGPA:" +cgpa);


    }

    public static void main(String[] args) {

        Student1 obj = new Student1();
        obj.setName("Moon ");
        obj.setId(332);
        obj.setCgpa(3.98);

        obj.displat();




    }


}
