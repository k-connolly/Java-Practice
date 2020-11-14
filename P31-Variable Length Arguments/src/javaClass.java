
public class javaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int array[][] = {{1,2,3,4,5},{6,7,8,9},{10,11,12,13,14}};
		javaClass.output(array);
		
		//either way works, first might use less memory
		double avg = average(24,234,434,4235,23,42);
		System.out.println(avg);
		//System.out.println(average(24,234,434,4235,23,42));
	}
	
	public static double average(int...numbers) {//don't know how many arguments we have or need
		//... is the ellipse
		double total = 0;
		//Iterates through all arguments that are given
		for (int x : numbers) { //takes the argument and passes them through x to add to the total variable
			total+=x;
		}
		return total/numbers.length;
	}
	
	public static void output(int x[][]) {
		for(int[] i : x) {
			for(int j : i) {
				//System.out.print();
				System.out.print(j +"\t");
			}
			System.out.println("");
			//after rows finished iterating, new line
			//for the next rows values
		}
	}

}
