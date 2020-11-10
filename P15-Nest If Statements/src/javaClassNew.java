
public class javaClassNew {
	private static int userNum;
	
	public javaClassNew(int num) {
		userNum = num;
	}
	
	public int getNum() {
		return userNum;
	}
	
	public void evaluation() {
		//Evaluate the users number with if 
		//and nested if statements
		if (userNum < 10) {
			System.out.println("Pass: " + userNum);
		} else {
			System.out.println("Fail: " + userNum);
			if (userNum > 20) {
				System.out.println("Nested Pass: " + userNum);
			} else {
						System.out.println("Nested Fail: " + userNum);
			}
		} 
	}
}
