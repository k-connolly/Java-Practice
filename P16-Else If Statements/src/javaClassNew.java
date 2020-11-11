
public class javaClassNew {
	private int inputNum;
	
	public javaClassNew(int num) {
		inputNum = num;
	}
	
	public int getNum() {
		return inputNum;
	}
	
	//Test conditions in message method
	//does the same than throwing in main
	public void message() {
		if (inputNum >= 50) {
			System.out.println("That's a big number!");
		} else if (inputNum >= 25) {
			System.out.println("That's a medium number!");
		} else {
			System.out.println("That's a small number!");
		}
	}
}
