import java.util.Scanner;
public class javaClass {
	private static int c;
	private static int m;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter initial number: ");
		c = input.nextInt(); //set count variable
		System.out.print("Enter maximum number: ");
		m = input.nextInt();//set max count variable
		input.close();
		
		//Set the user inputs as parameters to the outside class
		javaClassNew object = new javaClassNew(c,m);
		object.doWhile();
	}

}
