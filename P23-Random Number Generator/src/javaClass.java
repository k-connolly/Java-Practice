import java.util.Scanner;
public class javaClass {
	private static int roles;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many role?: ");
		roles = input.nextInt();
		input.close();
		
		javaClassNew object = new javaClassNew(roles);
		object.roleMethod();
	}

}
