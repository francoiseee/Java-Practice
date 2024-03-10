import java.util.*;

public class easyPassword {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        while(true){
            System.out.print("Enter a password: "); String pass = input.nextLine();
            char ch; 
            boolean hasDigit = false;
            boolean  UpperCase = false;
            boolean LowerCase = false;
     
                for (int i = 0; i < pass.length(); i++) {
                    ch = pass.charAt(i);
                    if (Character.isUpperCase(ch)) {
                        UpperCase = true;
                    }
                    if (Character.isLowerCase(ch)) {
                        LowerCase = true;
                    }
                    if (Character.isDigit(ch)) {
                        hasDigit = true;
                    }
                }
                
                if (UpperCase && LowerCase && hasDigit) {
                    System.out.print("Valid! Re-enter your password: "); String pass2 = input.nextLine();
                    if (pass2.equals(pass)){
                        System.out.println("Thank you so much! ");
                        break;
                    }
                } else {
                    System.out.println("Invalid");
                    
            } 
        }
    }
}
