import java.util.Scanner;
public class javaClass {
	static double firstNum; 
	static double secondNum;
	static double equalsAns;
	
	/*
	 * Methods that calculate the two variable
	 * inputs together to get a total. Total value 
	 * is then returned when the method is called.
	 */
	public double addMethod() {
		equalsAns = firstNum + secondNum;
		return equalsAns;
	}
	
	
	public double multiplyMethod() {
		equalsAns = firstNum * secondNum;
		return equalsAns;
	}
	
	public double subtractMethod() {
		equalsAns = firstNum - secondNum;
		return equalsAns;
	}
	
	public double divideMethod() {
		equalsAns = firstNum / secondNum;
		return equalsAns;
	}
	/*******************************************/

	public static void main(String[] args) {
		// Creating an object from the scanner class, class takes a input through parameters
		Scanner inputCal = new Scanner(System.in);
		
		//Object of the class
		javaClass object = new javaClass();
		
		System.out.print("Enter first number: ");
		firstNum = inputCal.nextDouble();
		
		System.out.print("Enter second number: ");
		secondNum = inputCal.nextDouble();
		
		// Totals printed to terminal
		System.out.println("Your numbers Added: " + object.addMethod());
		System.out.println("Your numbers Multiplied: " + object.multiplyMethod());
		System.out.println("Your numbers Subtracted: " + object.subtractMethod());
		System.out.println("Your numbers Divided: " + object.divideMethod());
		
		inputCal.close(); //Close scanner object
	}

}
