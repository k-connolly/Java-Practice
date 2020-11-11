import java.util.Scanner;
public class javaClass {
	//VERY BASIC, NOT FULL EQUATION
	// A = P (1 + R)^n
	
	//private static double amount; //not needed
	private static double principal;
	private static double rate;
	private static int years;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Principle: ");
		principal = input.nextDouble();
		System.out.print("Rate: ");
		rate = input.nextDouble();
		System.out.print("Years/Period: ");
		years = input.nextInt();
		input.close();
		
		javaClassNew newObject = new javaClassNew(principal, rate, years);
		newObject.interestCalculation();
		

	}

}
