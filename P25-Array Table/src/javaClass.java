import java.util.Scanner;
public class javaClass {
	private static int total;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of indexes?: ");
		total = input.nextInt();
		
		//Create the array and set the input to the total number of indexes
		int myArray[] = new int[total];
		//Iterate through the array and setting each index with an input value
		for(int index = 0; index < myArray.length; index++) {
			System.out.print("Index: " + "'"+ index + "'" + " = ");
			myArray[index] = input.nextInt();//set input to the index
		}
		input.close();
		
		
		System.out.println("Index\tValue");
		//int array[] = {13, 34, 25, 402, 32};
		//Iterate through the array and display the values per each index
		for(int index = 0; index < myArray.length; index++) {
			System.out.println(index + "\t" + myArray[index]);
		}
	}

}
