
public class javaClassNew {
	private static int userNum;
	
	public javaClassNew(int num) {
		userNum = num;
	}
	
	public int getNum() {
		return userNum;
	}
	
	public void message() {
		//comparing statement ? "case 1" : "case 2"
		//userNumSystem.out.println(userNum >= 40 ? "That's a big number!" : "That's small!"); //yes/true : no/false
		System.out.println((userNum >= 50) ? "Thats big!" : (userNum >= 30) ? "Thats medium!" : (userNum < 30) ? "Thats small!" : "ERROR");
	}
}