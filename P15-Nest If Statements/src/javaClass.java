import java.util.Scanner;
public class javaClass {
	private static int userNum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Pick a number!: ");
		userNum = input.nextInt();
		input.close();
		
		//Pass input through parameter to constructor
		//MUST CREATE OBJECT AFTER INPUT IS ASSIGNED
		javaClassNew newObject = new javaClassNew(userNum);
		newObject.evaluation();
	}

}
