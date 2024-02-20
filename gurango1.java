import java.util.*;
import java.text.*;

class gurango1{
	static Scanner input = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#,##0.00");

	static void add(){
		System.out.println("This method is for displaying only");
	}

	static void add(int no3, double no1){
	double sum = no3+no1;
	//System.out.println("The sum of " +(int)no3 + " and " + (int)no1 + ": "+ (no3+no1));
	return sum;
	}
	public static void main (String[] args){
		System.out.print("Enter 1st number: "); double no1 = input.nextDouble();
		System.out.print("Enter 2nd number: "); double no2 = input.nextDouble();
		System.out.print("Enter 3rd number: "); int no3 = input.nextInt();
		System.out.println();
		System.out.println("The sum of "+ no3+ " and" + no1 + ": ");

		add(no3, no1);
		add();
		add(no1);
		add(no1, no2);
	}
	static void add(double no1){
		System.out.println("The sum of " +(int)no1 + " and 20: " +(no1+20));
	}
	static void add(double no1, double no2){
	System.out.println("The sum of " +(int)no1 + " and "+ (int)no2 + ": "+ (no1+no2));
	}
}

/*
import java.util.*;
import java.text.*;

class gurango{
	static Scanner input = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#,##0.00");
	public static void main (String[] args){
		System.out.print("Enter 1st number: "); double no1 = input.nextDouble();
		System.out.print("Enter 2nd number: "); double no2 = input.nextDouble();
		System.out.println(Math.abs(no1));
		System.out.println("Maximum value: " +Math.max(no1, no2));
		System.out.println("Minimum value: " +Math.min(no1, no2));
		System.out.println("Round value: " +Math.round(no1));
		System.out.println("Square root of "+no1+ ": " +df.format(Math.sqrt(no1)));
		System.out.println("Cube root of "+no1+ ": " +df.format(Math.cbrt(no1)));
		System.out.println("Ceiling value of "+no1+ ": "+Math.ceil(no1));
		System.out.println("Floor value of "+no1+ ": "+Math.ceil(no1));
	}
}
*/
