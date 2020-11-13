
public class javaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5,6};
		
		shift(array);//method takes array as parameter
		
		//Shows all the values with the addition change
		for(int i : array) {
			System.out.println(i);
		}
	}
	
	public static void shift(int x[]) {
		for(int i = 0; i < x.length; i++) {
			x[i]+=5; //adds 5 to each value in array
		}
	}

}
