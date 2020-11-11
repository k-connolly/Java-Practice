import java.util.Scanner;
public class javaClass {
	static int month;
	static int dayOfWeek;
	
	public void switchMonth() {
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid numeric!");
			break;
		}
		
	}
	
	public void switchDay() {
		switch (dayOfWeek) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Numeric");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		javaClass object = new javaClass();
		
		System.out.print("Enter Month Number (1-12): ");
		month = input.nextInt();
		
		System.out.print("Enter Day Number (1-7): ");
		dayOfWeek = input.nextInt();
		input.close();
		
		
		System.out.print("Your selected Month = ");
		object.switchMonth();
		
		System.out.print("Your selected Day = ");
		object.switchDay();
		
		
	}

}
