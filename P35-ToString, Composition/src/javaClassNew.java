
public class javaClassNew {
	private String buyer;
	private String item;
	private OutsideClass info;
	
	public javaClassNew(String b, String i, OutsideClass in) {
		this.buyer = b;
		this.item = i;
		this.info = in;
		
		//Don't really need it, just helps display format of data
		//System.out.printf("The 'javaClasNew' Constructor string %s\n", this);
	}
	
	public String toString() {
		return String.format("Buyer: %s\nItem: %s\n---------Info---------%s", buyer, item, info);
	}
	/*
	private String name;
	private OutsideClass birthday;//reference to 'outsideclass' object
	
	public javaClassNew(String n, OutsideClass date) {
		this.name = n;
		this.birthday = date;
		
		System.out.printf("The 'javaClassNew' constructor string %s\n", this);
	}
	
	public String toString() {
		//References the 'name' in the first %s, and the birthday references the
		//object of the 'OutsideClass' from its toString method to pass the string value
		//Since, birthday isn't technically a string value, the toString value passes it 
		//as a string value in order for this method to display the string value.
		return String.format("Name: %s, Birthdate: %s", name, birthday);
	}
	*/

}
