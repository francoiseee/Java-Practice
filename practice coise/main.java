import java.util.*;

public class main{
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Set values using setter methods
        System.out.println("Please enter your account number: ");
        account.setAccountNumber(input.nextLine());
        account.setBalance(1000.0);

        // Get values using getter methods
        String accountNumber = account.getAccountNumber();
        double balance = account.getBalance();

        //Print the values
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);

    }
}