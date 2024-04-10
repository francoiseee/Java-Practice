import java.util.*;
public class mainCustomer {
    static Scanner input = new Scanner(System.in);
public static void main(String[] args) {
    System.out.print("Enter Customer Number\t:\t"); String a = input.nextLine(); 
    System.out.print("Enter Customer Name\t:\t"); String b = input.nextLine(); 
    System.out.print("Enter Address\t\t:\t"); String c = input.nextLine(); 
    System.out.print("Enter Item Description\t:\t"); String d = input.nextLine(); 
    System.out.print("Enter Item Price\t:\tPhp"); double e = input.nextDouble(); 
    System.out.print("Enter Quantity\t\t:\t"); int f = input.nextInt(); 
    System.out.print("Mode of Payment\n[1]\tCash\n[2]\tTwo Installments\n[3]\tThree Installments\t:\t"); int g = input.nextInt();

    customer x = new customer(a,b,c,d,e,f,g);

    // Display customer details 
    x.displayCustomer(); 
    // Display menu 
    x.displayMenu(); 
    // Process user's choice and display total and net total 
    x.choice(); 
    System.out.println("Total Price : Php " + x.total); 
    System.out.println("Net Price : Php " + x.nettotal);
}
}
