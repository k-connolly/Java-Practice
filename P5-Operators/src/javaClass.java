import java.util.Scanner;
public class javaClass {
	//Declare variables
	static int sharks;
	static int turtles;
	static int seaLife;
	
	public int addition() {
		seaLife = sharks + turtles;
		return seaLife;
	}
	
	public int subtraction() {
		seaLife = sharks - turtles;
		return seaLife;
	}
	
	public int multiplication() {
		seaLife = sharks * turtles;
		return seaLife;
	}
	
	public int division() {
		seaLife = sharks / turtles;
		return seaLife;
	}
	
	public int remainder() {
		seaLife = sharks % turtles;
		return seaLife;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Object of the class
		javaClass object = new javaClass();
		
		//User inputs for integer values
		System.out.print("Number of Sharks?: ");
		sharks = input.nextInt();
		System.out.print("Number of Turtles?: ");
		turtles = input.nextInt();
		
		//Calling methods that did calculations to show totals
		System.out.println("Addition Total: " + object.addition());
		System.out.println("Subtraction Total: " + object.subtraction());
		System.out.println("Multiplication Total: " + object.multiplication());
		System.out.println("Division Total: " + object.division());
		System.out.println("Remainder of Division Total: " + object.remainder());
		
		//Close scanner object
		input.close();

	}

}
