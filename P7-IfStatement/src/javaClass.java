import java.util.Scanner;
public class javaClass {
	
	static String name = "Kellen";
	static int intValue = 20;
	static int userValue;
	static String inputVar;
	
	public void ifMethod() {
		if (userValue == intValue) 
		{
			if (inputVar.equalsIgnoreCase(name)) 
			{
				System.out.println("Input equals: " + "'" + inputVar+ "'" + " which equals " + "'" + name + "'" + " from variable!");
			} else {
				System.out.println("Input does not match variable value!");
			}
		} else {
			System.out.println("Value " + "'" + userValue + "'" + " did not Match needed Value " + "'" + intValue + "'" + "!");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		javaClass object = new javaClass();
		
		
		System.out.print("Enter name: ");
		inputVar = input.nextLine();
		
		System.out.print("Enter number: ");
		userValue = input.nextInt();
		
		input.close();
		
		object.ifMethod();
		
		
		
		/*
		int value = 6;
		
		if (value == 22) //exactly equals
		{
			System.out.println("True");
		} else {
			System.out.println("Value not equal to: " + value);
		}
		
		if (value != 22) //logical not equal to
		{
			System.out.println("False");
		} else {
			System.out.println("Value equal to: " + value);
		}
		*/
	}

}
