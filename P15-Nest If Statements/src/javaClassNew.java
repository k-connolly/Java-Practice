
public class javaClassNew {
	private static int inputNumber;
	
	public javaClassNew(int num) {
		inputNumber = num;
	}
	
	public int getNum() {
		return inputNumber;
	}
	
	public void evaluation() {
		//Evaluate the users number with if 
		//and nested if statements
		if (inputNumber < 10) {
			System.out.println("Pass: " + inputNumber);
		} else {
			System.out.println("Fail: " + inputNumber);
			if (inputNumber > 20) {
				System.out.println("Nested Pass: " + inputNumber);
			} else {
						System.out.println("Nested Fail: " + inputNumber);
			}
		} 
	}
}
