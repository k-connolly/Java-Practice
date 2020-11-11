import java.util.Scanner;
public class mainClass {
	private static int ssn;
	private static String name;
	private static int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constructor encapsulation example
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.print("Employee ssn: ");
		ssn = input.nextInt();
		System.out.print("Employee Name: ");
		name = input.next();
		System.out.print("Age: ");
		age = input.nextInt();
		input.close();
		
		System.out.println(""); //spacer
		
		encapsulation object = new encapsulation(ssn, name, age);
		object.information();
		*/
		//----------------------------------//
		
		Scanner encap = new Scanner(System.in);
		
		System.out.print("Employee SSN: ");
		ssn = encap.nextInt();
		System.out.print("Employee Name: ");
		name = encap.next();
		System.out.print("Employee Age: ");
		age = encap.nextInt();
		encap.close();
		
		//Object of the encapsulation class
		encapsulation object = new encapsulation();
		object.setSSN(ssn);//set user value
		object.setName(name);//set user value
		object.setAge(age);//set user value
		
		//Print out the user input values by get methods
		System.out.println("EMPLOYEE INFO");
		System.out.println(object.getSSN());
		System.out.println(object.getName());
		System.out.println(object.getAge());
	}

}
