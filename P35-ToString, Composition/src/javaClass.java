
public class javaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutsideClass object = new OutsideClass("Barker",1,100,200);
		//passes the values from the 'object' to this 'object2'
		javaClassNew object2 = new javaClassNew("Kellen","Gun",object);
		
		System.out.println(object2);
	}

}
