import java.util.*;

public class array {
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        double [] numList = new double [10]; 
        System.out.println("Enter 10 prices: ");
        for (int i = 0; i < numList.length; i++) {
            System.out.print("Price: " + (i+1) + "\nPhp: ");
            numList[i] = input.nextDouble(); 
        }

        char answer = ' '; 

        do{
            System.out.println("Array Menu");
            System.out.println("[A]\tSum of all prices\n[B]\tValues less than Php 15.00\n[E]\tExit\n");
            System.out.print("Enter Choice: ");
            char choice = input.next().toUpperCase().charAt(0);

            if (choice == 'A') 
                una(numList); 
            else if (choice == 'B') 
                pangalawa(numList); 
            else if (choice == 'E'){
                System.out.println("Program is terminating.");
                System.exit(0);
            }

            System.out.print("Do you want to try again? Answer[y]: ");
            answer = input.next().toLowerCase().charAt(0);            
        }
        while(answer == 'y');
    }

        public static void una (double[] givenArray){
            double total = 0;
            for (double num : givenArray) total += num; 
            System.out.println("Sum of all prices: " + String.format("%.2f",total));
        }

        public static void pangalawa (double[] givenArray){
            System.out.println("Values less than 15: ");
            for (double num : givenArray){
                if (num < 15)
                System.out.println("Php" + num + " ");
            }
            
        }
        
}
