package Lab4;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size  = inp.nextInt();
        int [] arr  = new int [size];
        System.out.println("Enter the values: ");
        for (int i = 0 ; i < size ; i++)
        {
            arr[i] = inp.nextInt();
        }
        for (int i = 0 ; i < size ; i++)
        {
            System.out.println("The values of Arry ["+i+"]:" +arr[i] );
        }
    }
}
