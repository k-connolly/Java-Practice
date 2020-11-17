
public class javaClassNew {
	private int sum;
	private final int ADD; //constant, can't change
	private final int MINUS;
	
	public javaClassNew(int n, int m) {
		ADD = n; //can only set the constant once
		MINUS = m;
	}
	
	public void add() {
		sum += ADD;
	}
	
	public void subtract() {
		sum -= MINUS;
	}
	
	public String toString() {
		return String.format("Sum = %d\n", sum	);
	}
}
