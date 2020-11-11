import java.util.Scanner;
public class javaClass {
	private static int userNum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your a number: ");
		userNum = input.nextInt();
		input.close();
		
		javaClassNew newObject = new javaClassNew(userNum);
		newObject.message();
	}

}
