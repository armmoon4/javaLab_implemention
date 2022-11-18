class test {

    int i  = 4;

}

class b extends test
{
    int j = 8 ;
}

class inheritance
{
    public static void main(String[] args) {
        b s1 = new b();
        System.out.println( s1.i + " " + s1.j);

    }
}
