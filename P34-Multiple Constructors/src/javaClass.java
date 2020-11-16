import java.util.Scanner;
public class javaClass {
	private static String firstName;
	private static String middleName;
	private static String lastName;
	/*
	private static int first;
	private static int second, third;
	private static int fourth, fifth, sixth;
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Name: ");
		firstName = input.next();
		System.out.print("Enter Middle Name: ");
		middleName = input.next();
		System.out.print("Enter Last Name: ");
		lastName = input.next();
		input.close();
		
		javaClassNew object = new javaClassNew();
		javaClassNew object2 = new javaClassNew(firstName);
		javaClassNew object3 = new javaClassNew(firstName,middleName);
		javaClassNew object4 = new javaClassNew(firstName,middleName,lastName);
		System.out.println();//spacer
		
		System.out.println("VALUES SPECIFIED BY THE PARAMETERS TAKEN");
		System.out.println(object.display());
		System.out.println(object2.display());
		System.out.println(object3.display());
		System.out.println(object4.display());
		
		/*
		System.out.println("Input first set of numbers: ");
		first = input.nextInt();
		System.out.println("Input second set of numbers: ");
		second = input.nextInt();
		third = input.nextInt();
		System.out.println("Input third set of numbers: ");
		fourth = input.nextInt();
		fifth = input.nextInt();
		sixth = input.nextInt();
		input.close();
		
		javaClassNew object = new javaClassNew();
		javaClassNew object2 = new javaClassNew(first);
		javaClassNew object3 = new javaClassNew(second,third);
		javaClassNew object4 = new javaClassNew(fourth,fifth,sixth);
		
		System.out.printf("%s\n", object.display());
		System.out.printf("%s\n", object2.display());
		System.out.printf("%s\n", object3.display());
		System.out.printf("%s\n", object4.display());
		*/
	}

}
