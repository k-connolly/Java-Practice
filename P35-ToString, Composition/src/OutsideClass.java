
public class OutsideClass {
	private String Manufacturer;
	private int quantity;
	private int quality;
	private int price;
	
	public OutsideClass(String m, int quan, int qual, int p) {
		this.Manufacturer = m;
		this.quantity = quan;
		this.quality = qual;
		this.price = p;
		
		//Don't really need it, just helps display format of data
		//System.out.printf("The 'OutsideClass' Constructor %s\n", this);
	}
	
	public String toString() {
		return String.format("\nManufacturer: %s\n Quantity: %d\n Quality: %d%%\n Price: $%d\n", Manufacturer, quantity, quality, price);
	}
	/*
	private int month;
	private int day;
	private int year;
	
	public OutsideClass(int m, int d, int y) {
		this.month = m;
		this.day = d;
		this.year = y;
		
		//'This' in this print statement references the current object of the class, which looks
		//for the toString method of this 'OutsideClass' Class to print the statement.
		System.out.printf("The 'OutsideClass' constructor string %s\n", this);//%s\n string and newline
	}
	
	public String toString() {//built in method of java
		return String.format("%02d/%02d/%02d", month, day, year); //date format
	}
	*/
}
