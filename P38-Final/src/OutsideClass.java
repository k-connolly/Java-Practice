
public class OutsideClass {
	private int age;
	private final String name;
	private final String lname;
	
	public OutsideClass(String n, String l, int a) {
		name = n;
		lname = l;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLastName() {
		return lname;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return String.format("First: %s\nLast: %s\nAge: %d\n", getName(),getLastName(), getAge());
	}
}
