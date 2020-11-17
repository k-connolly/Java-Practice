
public class javaClassNew extends OutsideClassNew{
	private double gpa;
	public javaClassNew(String f, String l, double gpa) {
		super(f, l);
		this.gpa = gpa;
	}
	//A method Overriden
	public void aMethod() {
		System.out.println("Overriden A Method!");
	}
	
	@Override
	//Inherits the Super's toString method then adds
	//its data to the inherited toString method
	public String toString() {
		return super.toString() + "GPA: " + gpa + "\n";
	}
}
