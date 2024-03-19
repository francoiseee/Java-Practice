import java.util.*;
public class mainCustomer {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        pangalawa coise = new pangalawa();

        System.out.println("Enter Customer Details: ");
        System.out.print("Enter Number: "); coise.setnum(input.nextLine());
        System.out.print("Enter Name: "); coise.setname(input.nextLine());
        System.out.print("Enter Address: "); coise.setaddress(input.nextLine());
        System.out.print("Enter Item description: "); coise.setdescription(input.nextLine());
        System.out.print("Enter Item price: "); coise.setprice(input.nextDouble());
        System.out.print("Enter Quantity: "); coise.setquantity(input.nextDouble()); input.nextLine();
        coise.menu();
        System.out.print("Enter Mode of payment: "); coise.choice(input.nextLine().charAt(0));
        coise.display();

    }
}


