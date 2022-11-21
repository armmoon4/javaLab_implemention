public class testfinallyBlock {
    public static void main(String[] args) {
        try {

            int data = 25 / 0;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        //   catch (ArithmeticException o) {
        // System.out.println(o);
        // }




        finally {
            System.out.println("finally block is already execute");
        }
    }
}
