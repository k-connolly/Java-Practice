import java.util.EnumSet;
public class javaClass {

	public static void main(String[] args) {
		//ALL objects that are items
		for(javaClassNew items : javaClassNew.values()) {
			//System.out.printf("%s\n\t%s\t%s\t%d\t%s\t$%d\n", items, items.getMan(), items.getName(), items.getQuantity(), items.getQuality(), items.getPrice());
			System.out.print(items + "\n");
			System.out.println("Manufacturer: " + items.getMan());
			System.out.println("Name: " + items.getName());
			System.out.println("Quantity: " + items.getQuantity());
			System.out.println("Quality: " + items.getQuality());
			System.out.println("Price: $" + items.getPrice());
			System.out.println();//Spacer for readability
		}
		
		//Specified Range of objects from 3 to 6
		for(javaClassNew items : EnumSet.range(javaClassNew.Item3, javaClassNew.Item6)) {
			System.out.print(items + "\n");
			System.out.println("Manufacturer: " + items.getMan());
			System.out.println("Name: " + items.getName());
			System.out.println("Quantity: " + items.getQuantity());
			System.out.println("Quality: " + items.getQuality());
			System.out.println("Price: $" + items.getPrice());
			System.out.println();//Spacer for readability
		}
		
		/*
		//Passes the object values into the 'people' value, 
		//iterates through each object that was declared in 
		//the enum class 'javaClassNew'
		for(javaClassNew people : javaClassNew.values()) {
			//Print out the String values of the objects and provide formatting
			System.out.printf("%s\t%s\t%s\n", people, people.getDescription(), people.getYear());//just for formatting
		}
		*/
	}

}
