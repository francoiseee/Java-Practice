import java.text.DecimalFormat;
import java.util.Scanner;

public class gurango {
    static Scanner input = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#,##0.00");
    public static void main(String[] args) {

        int [] no = new int [5];
        String [] pangalan = new String [5];
        int [] sum = new int [5];

        System.out.println("Enter 5 numbers: "); //sout
        for (int i = 0; i < 5; i++) {              //fori
            no[i] = input.nextInt();
            sum[i] = no[i] + 5;
        }

        input.nextLine();

        System.out.println("Enter 5 Names: ");
        for (int i = 0; i < sum.length; i++) {
            pangalan[i] = input.nextLine();
        }
        
        System.out.println("Displaying 5 inputted numbers: ");
        for (int j = 0; j < sum.length; j++) {
            System.out.println("Name\tBefore Value\tAfter Value");
            System.out.println(pangalan [j] + "\t\t" + no [j] + "\t\t" + sum [j]);
        }
    /*     for (int i : sum) {
            System.out.println(i);              //foreach (parang fori lang din)
        }
    */
            
        }
    }
//--------------------------------------------------------------------------------
    /* 
        int [] no = new int [5];
        int [] sum = new int [5];
        System.out.println("Enter 5 numbers: "); //sout
        for (int i = 0; i < 5; i++) {              //fori
            no[i] = input.nextInt();
            sum[i] = no[i] + 5;
        }

        System.out.println("Displaying 5 inputted numbers: ");
        for (int i = 0; i < 5; i++) {              
            System.out.println(sum[i]);
        }
            for (int i : sum) {
            System.out.println(i);              //foreach (parang fori lang din)
        }
    */   
//--------------------------------------------------------------------------------
    /*    int [] no = new int [5];
        System.out.println("Enter 5 numbers: "); //sout
        for (int i = 0; i < 5; i++) {              //fori
            no[i] = input.nextInt();
        }
        
        System.out.println("Displaying 5 inputted numbers: ");
        for (int i = 0; i < 5; i++) {              
            System.out.println(no[i]);
        }

        System.out.println("Array at index 3: " + no[3]);
    */
