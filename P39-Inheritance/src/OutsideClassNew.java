//super class
public class OutsideClassNew {
	private String fname;
	private String lname;
	
	public OutsideClassNew(String f, String l) {
		this.fname = f;
		this.lname = l;
	}
	
	public void aMethod() {
		System.out.println("A Method");
	}
	
	public String toString() {
		return String.format("Name: %s\nLast: %s\n", fname,lname);
	}
}
