
public class javaClassNew {
	private static String dogName;
	
	public void setName(String name) {
		dogName = name;//sets user input to dogName
	}
	
	public String getName() {
		return dogName;//setName doesn't return string, this returns input
	}
	
	public void correctName() {
		System.out.println("Correct, dog name is: " + getName());
	}
	
	public void wrongName() {
		System.out.println("Incorrect Name!: " + getName());
	}
	
	/*	Example Code
	
	//private String nameDog; //only methods inside class can use variable
	public void setDogName(String name) { //takes user input parameter
		nameDog = name; //argument from parameter sets the value to the protected variable of the class
	}
	
	public String getName() { //returns string type value, returns the user specified name
		return nameDog;
	}
	
	public void message() { //method returns nothing, just displays user inputed name
		System.out.printf("Your dogs name is %s" , getName());
	}
	*/
	
	
}
