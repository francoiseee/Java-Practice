import java.util.*;

public class exceptionHandling {
    static Scanner get = new Scanner (System.in);
    public static void main(String[] args) {
        
        //Do not use the exception handling if you are catching beyond four errors.
        try {
            System.out.print("Enter 1st whole number: ");
            int no1 = get.nextInt();
            System.out.print("Enter 2nd whole number: ");
            int no2 = get.nextInt();

            checking(no1, no2);

            double quo = no1 / no2;
            System.out.println("Quotient: " + quo);
        } catch (InputMismatchException e) {
            //e.getMessage() - gets the built in comment or output
            System.out.println("Wrong data type");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (DataException e) {
            
        }

        //a 'catch' that handles all exceptions
        //synthax: catch (Exception e) {System.out.println("All exceptions")}

        finally{
            System.out.println("Thank you for using my program.");
        }
        
        

        
        //System.out.println("Number: " + no1);
    }

    static void checking(int no1, int no2) throws DataException
    {
        if (no1 < 0 || no2 < 0)
        {
            System.out.println("Number(s) are below zero");
            System.exit(0);
        }
        if(no1 > 100 || no2 > 100)
        {
            System.out.println("Number(s) are above 100");
            System.exit(0);
        }
    }
}
