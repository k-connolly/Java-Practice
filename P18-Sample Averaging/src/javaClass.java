import java.util.Scanner;
public class javaClass {
	
	private static int total = 0;
	private static int grade;
	private static int average;
	private static int counter = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 10 grades: ");
		while(counter < 10) {
			System.out.print("'" + counter + "'" + ": ");
			grade = input.nextInt();
			
			if(grade > 100 || grade < 0) {
				System.out.println("Invalid grade");
			} else {
				total = total + grade;
				counter++;
			}
		}
		input.close();
		
		average = (int) (total/10.0);
		System.out.println("Average = " + average);

	}

}
