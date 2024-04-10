import java.util.*;
public class mainConstructor {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // constructor x = new constructor();
        // x.display();

        System.out.print("Enter the product: "); String a = input.nextLine();
        System.out.print("Enter the quantity: "); int b = input.nextInt();
        System.out.print("Enter the amount: "); double c = input.nextDouble();        

        constructor x = new constructor(a, b, c);
        
    }
}
