import java.util.Scanner;
public class javaClass {
	private static String fishName;
	private static int fishAge;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//User Input name, to pass parameter
		System.out.print("Enter your fish name: ");
		fishName = input.next();
		System.out.print("Enter your fish age: ");
		fishAge = input.nextInt();
		input.close();
		//-----------------------------------//
		
		//Can make multiple objects, each can
		//take different parameters but both
		//objects will not see each others values
		javaClassNew newObject = new javaClassNew(fishName, fishAge);
		newObject.message();
		
		/****************************************/
		//EXAMPLE of multiple objects with
		//different parameters for each
		javaClassNew newObject2 = new javaClassNew("Gary", 12);
		javaClassNew newObject3 = new javaClassNew("Barry", 4);
		newObject2.message();
		newObject3.message();
		/****************************************/
	}

}
