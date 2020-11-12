import java.util.Scanner;
public class javaClass {
	private static int numIndex;
	private static int index;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Indexes in Array?: ");
		numIndex = input.nextInt();
		
		int array[] = new int[numIndex];
		for(int setIndex = 0; setIndex < array.length; setIndex++) {
			System.out.print(setIndex + " = ");
			array[setIndex] = input.nextInt();
		}
		input.close();
		
		System.out.println("Values in array: ");
		outputArray(array);
	}
	
	public static void outputArray(int array[]) {
		int indexTotal = array.length;
		for (index = 0; index < indexTotal; index++) {
			System.out.println(index + " = " + array[index]);
		}
	}
	
			//BASIC ARRAY
			/*
			//Array initializer
			int array[]= {2, 7, 200, 45, 90};// 0 - 4
			System.out.println(array[1]);
			
			int myArray[] = new int[10];//index from 0 - 9, 10 variables
			
			myArray[0] = 87;
			myArray[1] = 470;
			myArray[2] = 10;
			
			System.out.print(myArray[0]);
			*/

}
