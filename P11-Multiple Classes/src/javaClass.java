import java.util.Scanner;
public class javaClass extends javaClassNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		javaClassNew objectOfNew = new javaClassNew();
		
		System.out.print("Enter a positive number: ");
		value = input.nextInt();
		input.close();
		
		objectOfNew.classMethod();
	}

}
