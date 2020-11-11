import java.util.Scanner;
public class javaClass {
	private static int ifValue;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your number: ");
		ifValue = input.nextInt();
		input.close();
		
		javaClassNew newObject = new javaClassNew(ifValue);
		newObject.message();
	}

}
