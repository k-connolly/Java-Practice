
public class javaClassNew {
	private String first;
	private String last;
	//changes with all objects
	//Created and shared among all other instances
	//of this class, used to share a common value 
	//amongst other instances.
	//all other members can access this variable.
	private static int members = 0;
	
	public javaClassNew(String f, String l) {
		first = f;
		last = l;
		//Each added member adds 1 to the static variable
		//all other members can see the changed value but cannot
		//see the other values of the objects, ie: their names.
		members++;
		System.out.printf("Constructor for %s %s, Total Members: %d\n", first, last, members);
	}
	
	//Instead of printing memory location, this prints the string value of the objects
	public String toString() {
		return String.format("%s %s, Total: %d", first, last, members);
	}
	
}
