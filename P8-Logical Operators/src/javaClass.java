import java.util.Scanner;
public class javaClass {
	static int computers;
	static int headphones;
	static int laptops;
	
	public void andTestMethod() {
		if (computers > 15 && headphones > 15) { //both conditions must be true in order to return true
			System.out.println("There are enough computers for class!");
		} else {
			System.out.println("Not enough computers or headphones!");
		}
	}
	
	public void orTestMethod() {
		if (computers > 10 || laptops > 5) { //one or both conditions must be true in order to return true
			System.out.println("There are enough computer and laptops!");
		} else {
			System.out.println("There are not enough computers or laptops!");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		javaClass object = new javaClass();
		
		System.out.print("Number of computers: ");
		computers = input.nextInt();
		
		System.out.print("Number of laptops: ");
		laptops = input.nextInt();
		
		System.out.print("Number of headphones: ");
		headphones = input.nextInt();
		input.close();
		
		object.andTestMethod();
		object.orTestMethod();
		

	}

}
