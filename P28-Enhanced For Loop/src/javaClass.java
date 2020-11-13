import java.util.Scanner;
public class javaClass {
	private static int total;
	private static int sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of indexes?: ");
		total = input.nextInt();
		
		int array[] = new int[total];
		for(int i = 0; i < array.length; i++) {
			System.out.print(i + " = ");
			array[i] = input.nextInt();//set index, assign user input to index
		}
		input.close();
		
		for(int i : array) { //stores values from array, the array (mem location)
			System.out.println(i);
			sum += i;
		}
		System.out.println("Sum: " + sum);

	}

}
