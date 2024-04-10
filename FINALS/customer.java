import java.text.*;
public class customer {
    private String customerNumber; 
    private String customerName; 
    private String customerAddress; 
    private String itemDescription; 
    private double itemPrice; 
    private int itemQuantity; 
    private int paymentMode; 
    public double total; 
    public double nettotal;


public customer() { 
    customerNumber = ""; 
    customerName = ""; 
    customerAddress = ""; 
    itemDescription = ""; 
    itemPrice = 0; 
    itemQuantity = 0; 
    paymentMode = 0; 
}

public customer(String a, String b, String c, String d, double e, int f, int g){
customerNumber = a;
customerName = b; 
customerAddress = c; 
itemDescription = d; 
itemPrice = e; 
itemQuantity = f; 
paymentMode = g;
}

public void displayCustomer(){
    System.out.println("Customer Details"); 
    System.out.println("Customer Number\t:\t" + customerNumber); 
    System.out.println("Customer Name\t:\t" + customerName); 
    System.out.println("Customer Address\t:\t" + customerAddress); 
    System.out.println("Item Description\t:\t" + itemDescription); 
    System.out.println("Item Price\t:\tPhp " + itemPrice); 
    System.out.println("Item Quantity\t:\t" + itemQuantity);
}

public void displayMenu(){
    System.out.println("\nMode of Payment:"); 
    System.out.println("[1]\tCash"); 
    System.out.println("[2]\tTwo Installments"); 
    System.out.println("[3]\tThree Installments");
}

public void choice(){
    switch (paymentMode) {
        case 1:
            // Cash - 5 percent discount 
            total = itemPrice * itemQuantity; 
            nettotal = total * 0.95;
            break;

        case 2:
            // Two installments - 5 percent interest 
            total = itemPrice * itemQuantity; 
            nettotal = total * 1.05; 
            break;

        case 3: 
            // Three installments - 10 percent interest 
            total = itemPrice * itemQuantity; 
            nettotal = total * 1.10; 
            break;
    
        default:
        System.out.println("Invalid choice!");
    }
}
}
