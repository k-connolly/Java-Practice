import java.util.Scanner;
public class javaClass {
	private static int totalIndex;
	private static int sum;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Number of Indexes: ");
		totalIndex = input.nextInt();
		int array[] = new int[totalIndex];
		//int array[] = {1,2,3,4,5,6};
		
		System.out.println("Index\tValue");
		sum(array);//method takes array as parameter
		
		System.out.println("Values in array:");
		//Shows all the values with the addition change
		for(int i : array) {
			System.out.println(i);
		}
		System.out.println("Sum: " + sum);
	}
	
	public static void sum(int x[]) {
		for(int i = 0; i < x.length; i++) {
			System.out.print(i + "\t");
			x[i] = input.nextInt();
			sum += x[i]; //add the value that is from that index and add it to a variable
			//x[i]+=5; //adds 5 to each value in array
		}
	}

}
