import java.util.Scanner;
public class javaClass {
	
	private static int i;
	private static int e;
	private static int c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter positive start number: ");
		i = input.nextInt();
		System.out.print("Enter positive end number:");
		e = input.nextInt();
		System.out.print("How much do you want to count by?: ");
		c = input.nextInt();
		input.close();
		
		/*
		 * Create instance of object after setting
		 * the input to the 2 private variables. User
		 * input 2 variables sent to the constructor of the 
		 * other class where it assigns it to another
		 * 2 private variables. Those variable are then assigned
		 * to the start and end counter of the for loop.
		 * Specifies a count by parameter for the for loop.
		 */
		javaClassNew newObject = new javaClassNew(i, e, c);
		newObject.forLoop();
		
		
		/* BASIC FOR LOOP
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		*/
	}

}
