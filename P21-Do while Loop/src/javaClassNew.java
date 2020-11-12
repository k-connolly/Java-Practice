
public class javaClassNew {
	private int c;
	private int m;
	
	//this.value to specify only within this class.
	public javaClassNew(int count, int max) {
		this.c = count;
		this.m = max;
	}
	
	//Method to call the doWhile loop
	public void doWhile() {
		//runs the condition at least once
		//then tests if the condition is true.
		//If it fails, it will only run once, 
		//while if it passes, it will run until
		//the condition fails.
		do {
			System.out.println(c);
			c++;
		} while (c <= m);
	}
}
