import java.util.Random;
public class javaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rNum = new Random(); //random number object
		int dice[] = new int[7];//array
		
		//Iterates a thousand times with the array
		for(int roll = 1; roll < 1000; roll++) {
			//chooses a random index and adds a one to that index
			dice[1+rNum.nextInt(6)]++; //shifts from 0-5 to 1-6
			//dice[#] <specifies the index
			//dices[#]++ or ++dices[#} <adds a 1 to that index
			//Since all indexes start off with 0, ++ adds 1 to them
			//if the dice[#] is the same and has a 1 in that index,
			//it adds another one making it 2. It shows the frequency
			//of the random numbers by specifying the index in the array
			//and adding a one in the indexes value.
		}
		
		System.out.println("Face\tFrequency");
		//Face is treated as the prefix for how 
		//frequent that number was rolled
		for(int face = 1; face < dice.length; face++) {
			System.out.println(face + "\t" + dice[face]);
		}
		//Loop runs and determines the frequency of 
		//the number of faces that were rolled on.
		//Face has to be one since 1 is the lowest
		//on a dice.

	}

}
