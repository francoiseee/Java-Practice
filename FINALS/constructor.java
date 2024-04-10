// public class constructor {
//     private String product;
//     private int quantity;
//     private double amount;

//     public constructor(){
//         product = " ";
//         quantity = 0;
//         amount = 0;
//     }


//     public void display(){
//         System.out.println("The product is: " + product);
//         System.out.println(quantity);
//         System.out.println("It costs: " + amount);
//     }
// }

//---------------------------------------------------------------------

public class constructor{
    public String product;
    private int quantity;
    private double amount;

    public constructor(String a, int b, double c){
        this.product = a;
        this.quantity = b;
        this.amount = c;

        System.out.println("Product: " + product);
        System.out.println("quantity: " + quantity);
        System.out.println("amount: " + amount);
}
}