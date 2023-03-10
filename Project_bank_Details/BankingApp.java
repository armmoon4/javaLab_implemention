package bankdetails;

import java.util.Scanner;


public class BankingApp {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\t\t\t\t\t\t\t\t*****************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t*                      ---- ---------- ------                   *");
        System.out.println("\t\t\t\t\t\t\t\t*                      BANK MANAGEMENT SYSTEM                   *");
        System.out.println("\t\t\t\t\t\t\t\t*                      ---- ---------- ------                   *");
        System.out.println("\t\t\t\t\t\t\t\t*****************************************************************\n\n");
        System.out.println("\t\t\t\t\t\t\t\t*****************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t*                            Team Members                       *");
        System.out.println("\t\t\t\t\t\t\t\t*        Name                   ----               ID           *");
        System.out.println("\t\t\t\t\t\t\t\t*    Md Abdur Rahman            ----           213-15-4343      *");
        System.out.println("\t\t\t\t\t\t\t\t*    Md Boni Amin               ----           213-15-4366      *");
        System.out.println("\t\t\t\t\t\t\t\t*    MD. Nayeem Hossain         ----           213-15-4335      *");
        System.out.println("\t\t\t\t\t\t\t\t*    Mustafizur Rahman Tonmoy   ----           213-15-4265      *");
        System.out.println("\t\t\t\t\t\t\t\t*    Maruf Soikot               ----           213-15-4323      *");
        System.out.println("\t\t\t\t\t\t\t\t*****************************************************************\n\n");
        System.out.print("Enter the number of Customers Data:");    //create initial accounts
        int n = sc.nextInt();
        BankDetails C[] = new BankDetails[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new BankDetails();
            C[i].openAccount();
        }
  // loop runs until number 5 is not pressed to exit
        int ch;
        do {
            System.out.println("\n ***AB BANK***");
            System.out.println("________________________________________________\n");
            System.out.println("1. Display all account details  ");
            System.out.println("2. Search by Account number");
            System.out.println("3. Deposit the amount");
            System.out.println("4. Withdraw the amount");
            System.out.println("5.Exit ");
            System.out.println("________________________________________________\n");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter account no. you want to search: ");
                    String ac_no = sc.next();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account no.: ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {

                            C[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 5:
                    System.out.println("See you soon...");
                    break;
            }
        } while (ch != 5);
    }
}