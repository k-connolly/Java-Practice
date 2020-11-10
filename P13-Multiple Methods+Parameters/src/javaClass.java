import java.util.Scanner;
public class javaClass {
	private static String onlyName = "Ruby";
	private static String dogName;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		javaClassNew newObject = new javaClassNew();
		
		System.out.print("Enter Brianna's dog name: ");
		dogName = input.next();
		input.close();
		
		if (dogName.equalsIgnoreCase(onlyName)) {
			newObject.setName(dogName);
			newObject.correctName();
		} else {
			newObject.setName(dogName);
			newObject.wrongName();
		}
		
		
		/* Example Code
		
		//private static String dogName;
		Scanner input = new Scanner(System.in);
		javaClassNew newObject = new javaClassNew();
		
		System.out.print("Enter your dog name: ");
		dogName = input.next();
		input.close();
		
		newObject.setDogName(dogName);
		newObject.message();
		*/
	}

}
