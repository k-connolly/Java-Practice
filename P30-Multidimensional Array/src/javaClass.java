
public class javaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int array[row][column]
		int firstArray[][]= {{8,9,10,11,12},{12,54,64,13,6}};//2 rows, 5 columns
		
		int secondArray[][]= {{53,43,56,12,43},{43},{51,5,6}};//3 rows, 5 columns
		//inside brackets specify the row, internal values are inputed into 
		/*
		 * 		columns
		 * rows		0	1	2	3
		 * 		0	x	x	x	x
		 * 		1	x	x	x	x
		 * 		2	x	x	x	x
		 * 		3	x	x	x	x
		 * 4x4 2D array
		 * 2d arrays are just 1d arrays that intersect via rows and columns
		 */
		
		System.out.println("First Array: ");
		output(firstArray);
		System.out.println();//spacer
		System.out.println("Second Array: ");
		output(secondArray);
		
		
		/*My implementation for array in main
		System.out.println("First Array: ");
			for(int i = 0; i < firstArray.length; i++) {//iterate over the length of the rows
				for(int j = 0; j < firstArray[i].length; j++) {//iterate over the length of the columns, by using i from the row length
					System.out.print(firstArray[i][j]+"\t");
				}
				System.out.println();//new line for each row
			}
			
			System.out.println("Second Array: ");
			for(int i = 0; i < secondArray.length; i++) {//iterate over the length of the rows
				for(int j = 0; j < secondArray[i].length; j++) {//iterate over the length of the columns
					System.out.print(secondArray[i][j] + "\t");
				}
				System.out.println();//new line for each row
			}
			*/
		
		}
	
	public static void output(int x[][]) 
	{
		for(int i = 0; i < x.length; i++) 
		{//iterate over the length of the rows
			for(int j = 0; j < x[i].length; j++) 
			{//iterate over the length of the columns, by using i from the row length
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();//new line for each row
		}
	}
}

