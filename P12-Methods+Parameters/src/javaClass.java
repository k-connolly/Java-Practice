import java.util.Scanner;
public class javaClass {
	static String name;
	static int age;
	static String city;
	static String state;
	static int zipCode;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		javaClassNew newObject = new javaClassNew();
		
		System.out.println("ENTER YOUR DETAILS");
		
		System.out.print("Enter your name: ");
		name = input.next();
		
		System.out.print("Enter your age: ");
		age = input.nextInt();
		
		System.out.print("Enter your birth city: ");
		city = input.next();
		
		System.out.print("Enter your birth state: ");
		state = input.next();
		
		System.out.print("Enter your birth zip code: ");
		zipCode = input.nextInt();
		input.close();
		
		newObject.message(name,age,city,state,zipCode);
	}

}
