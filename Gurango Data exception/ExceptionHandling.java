import java.util.*;
import java.text.*;
class ExceptionHandling{
    static Scanner input = new Scanner(System.in);
    static DecimalFormat f = new DecimalFormat ("##0.00");
    public static void main(String[]args){
        double quo = 0;

//maximum of 3 exception
    try {
// kung ano ung nag-e-error, ayun 'yung ilalagay sa try -- 'Try block'
        System.out.print("Enter 1st whole number: "); int no1 = input.nextInt();
        System.out.print("Enter 2nd whole number: "); int no2 = input.nextInt();
        checking(no1,no2);
        quo = (double) no1/no2;
        System.out.println("Quotient: " + quo);
    } 
    // can handle all exception
    catch (chaException e){
        // code= 0;
        // System.out.println(DataMessages.msg[code]);
        System.out.println("Exception must be handled.");
        System.out.println(e.getMessage());
    }
    catch (InputMismatchException e) {
        System.out.println("Wrong data type");
// pangalan ng exception, object name, default message
        System.out.println(e.getMessage());
    }
    catch (ArithmeticException e) {
        System.out.println(e.getMessage());
        System.out.println("Cannot divide by zero");
    }

    }

    static void checking(int no1, int no2) throws chaException{
        int code = 0;
        if(no1 < 0 || no2 < 0)
            throw new chaException(DataMessages.msg[code]);

        code=1;
        if(no1 > 100 || no2 > 100)
            throw new chaException(DataMessages.msg[code]);
            
        
    }
}
