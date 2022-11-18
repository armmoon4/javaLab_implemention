package midterm;

public class polyex2 {
    private String name ;
    private int age;

    public void setName(String name1) {
        this.name = name1 ;
    }

    public void setAge(int age1){
        this.age = age1 ;
    }

    public String getName()
    {
        return name;
    }

    public int getAge() {

        return age ;
    }


    public static void main(String[] args) {

        polyex2 s1 = new polyex2() ;
        s1.setName("Moon");
        s1.setAge(23);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());


    }

}
