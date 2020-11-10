import java.util.Scanner;
public class javaClass {
	static int whileCounter;
	
	public void whileLoopMethod() {
		while (whileCounter > 0) {
			System.out.println("Value: " + whileCounter);
			whileCounter--; //-=# to specify how much
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		javaClass object = new javaClass();
		
		System.out.print("Enter any positive Integer: ");
		whileCounter = input.nextInt();
		input.close();
		
		object.whileLoopMethod();
		
	}

}
