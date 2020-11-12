import java.util.Random;
public class javaClassNew {
	private int roles;
	private int number;
	private int count = 1;
	Random random = new Random();
	
	public javaClassNew(int roles) {
		this.roles = roles;
	}
	
	public void roleMethod() {
		for (int c = 1; c <= roles; c++) {
			//multiple ways to offset the random numbers
			/*
			 * Examples:
			 * if we just did;
			 * randNum.nextInt(6) <-- we would only get numbers 0 - 5
			 * 
			 * To offset:
			 * 1 + randNum.nextInt(6) <-- 1 - 6
			 * or
			 * randNum.nextInt(6)+1 <-- 1 - 6
			 * 
			 * Both offset the starting point from 0 to 1
			 * You can change the value of 1 to something else,
			 * however, it will offset the start by that much.
			 * Let's say we use 2, then the count will be 
			 * from 2 - 7 because we offset it by +2 from 0.
			 */
			number = random.nextInt(6)+1;// 1 - 6 <-- these are the 'six numbers'
			System.out.println("Role: " + count + " = " + number);
			count++;//readability for number of roles
		}
	}
	

}
