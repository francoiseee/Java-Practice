import java.util.*;

public class password {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        char [] specialchar = {'!', '@', '#', '$', '%', '^', '&', '*', '(', '|', ')', '+', '/', '?'};

        while(true) {
            System.out.println("Enter your password: "); 
            String password = input.nextLine();

            char [] passc = password.toCharArray(); 

            boolean tamangLength = password.length() > 8 && password.length() < 12; 
            boolean mayUpperCase = false; 
            boolean mayDigit = false; 
            boolean maySpecial = false; 

            for(char value: passc){
                if (Character.isUpperCase(value))
                mayUpperCase = true; 
                else if (Character.isDigit(value))
                mayDigit = true; 

                for (char element : specialchar) {
                    if (value == element)
                    maySpecial = true; 
                }
            }

            if (tamangLength && mayUpperCase && mayDigit && maySpecial){
                System.out.println("Re-enter your password: ");
                String ulit = input.nextLine(); 

                if (ulit.equals(password)){
                    System.out.println("Password successfully created! ");
                    System.exit(0);
                }
                else 
                    System.out.println("Passwords do not match. try again!");
            }

        }

    }
}
