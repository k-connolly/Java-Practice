
public enum javaClassNew {
	//Item(Manufacturer, name, quantity, quality, price)
	Item1("Unknown","Ammo",10,"NEW",200),
	Item2("Remington","Ammo",5,"NEW",250),
	Item3("Neff LLC","Ammo",100,"NEW",60),
	Item4("Shells Barn","Ammo",500,"NEW",100),
	Item5("Daves Market","Ammo",200,"NEW",80),
	Item6("Barrel Burn","Ammo",600,"NEW",220);
	
	private final String Manufacturer;
	private final String Name;
	private final int quantity;
	private final String quality;
	private final int price;
	
	javaClassNew(String m, String n, int quan, String qual, int p) {
		this.Manufacturer = m;
		this.Name = n;
		this.quantity = quan;
		this.quality = qual;
		this.price = p;
	}
	
	public String getMan() {
		return Manufacturer;
	}
	
	public String getName() {
		return Name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String getQuality() {
		return quality;
	}
	
	public int getPrice() {
		return price;
	}
	/*
	//Constants that also function as objects
	kellen("nice","21"),
	brianna("sweetie","21"),
	ruby("doggie","11");
	
	//Represent the arguments/parameters
	private final String description;
	private final String year;
	
	//ENUM constructor
	//Pass the object parameters that
	//are the declared constants
	javaClassNew(String d, String y){
		description = d;
		year = y;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getYear() {
		return year;
	}
	*/
}
