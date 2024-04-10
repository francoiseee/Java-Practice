import java.util.*;
public class mainStudent {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        student x = new student ();

        System.out.println("Student Details:"); 
        
        System.out.print("Enter student ID: "); int a = input.nextInt(); 
        System.out.print("Enter credit hours earned: "); int b = input.nextInt(); 
        System.out.print("Enter Points Earned: "); int c = input.nextInt();

        x.assignValues(a, b, c);

        System.out.println("\nStudent Details:"); 
        x.displayStudentDetails(); 
        input.close();
    }
}
