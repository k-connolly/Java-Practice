
public class javaClassNew {
	private int start;
	private int end;
	private int count;
	
	public javaClassNew(int num, int num2, int num3) {
		start = num;
		end = num2;
		count = num3;
	}
	
	public void forLoop() {
		for(int i = start ; i <= end; i += count) {
			System.out.println(i);
		}
	}
}
