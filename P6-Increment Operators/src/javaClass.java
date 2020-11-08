import java.util.Scanner;
public class javaClass {
	//Declarations
	static int angelFish;
	static int rainbowFish;
	static int tank;
	
	public int weeklyAdd() {
		angelFish = angelFish + 2;
		rainbowFish = rainbowFish + 2;
		
		tank = angelFish + rainbowFish;
		return tank;
	}
	
	public int angelDeath() {
		angelFish--;
		//or angelFish = angelFish - 5; depending on how many died
		return angelFish;
	}
	
	public int rainbowDeath() {
		rainbowFish--;
		return rainbowFish;
	}
	
	public int totalFish() {
		tank = angelFish + rainbowFish;
		return tank;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		javaClass object = new javaClass();
		
		System.out.print("Angelfish in tank: ");
		angelFish = input.nextInt();
		
		System.out.print("Rainbowfish in tank: ");
		rainbowFish = input.nextInt();
		
		
		System.out.println("Total Fish in tank = " + object.totalFish());
		System.out.println("Total fish after add = " + object.weeklyAdd());
		
		
		/*
		 * NOTES
		 */
		//++crab <-- preincrementing
		//crab++ <-- postincrementing
		//value = value + 5; <-- specific increment
		//value = value - 5; <-- specific decrement
		//value += 8 <-- add specific to value - assignment operator
		//value -= 8 <-- sub specific to value - assignment operator
		//value *= 8 <-- mult specific to value - assignment operator
	}

}
