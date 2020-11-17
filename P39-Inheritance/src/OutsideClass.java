
public class OutsideClass extends OutsideClassNew{
	private boolean student;
	public OutsideClass(String f, String l, boolean s) {
		super(f, l);
		this.student = s;
	}
	//A method Override
	public void aMethod() {
		System.out.println("Overriden A Method!");
	}
	

	@Override
	//Inherits the Super's toString method then adds
	//its data to the inherited toString method
	public String toString() {
		return super.toString() + "Student?: " + student + "\n";
	}

}
