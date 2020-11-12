import java.util.Scanner;
public class javaClass {
	private static int total;
	private static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of Indexes1?: ");
		total = input.nextInt();
		
		int array[] = new int[total];
		for(int index = 0; index < array.length; index++) {
			System.out.print(index + " = ");
			array[index] = input.nextInt();
		}
		input.close();
		
		System.out.println("Index\tValue");
		for(int index = 0; index < array.length; index++) {
			System.out.println(index + "\t" +array[index]);
			sum += array[index];
		}
		
		System.out.println("Sum = " + sum);
	}

}
