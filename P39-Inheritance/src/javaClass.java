
public class javaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaClassNew object = new javaClassNew("Garry", "Basil", 3.56);
		OutsideClass object2 = new OutsideClass("Barry", "Newman", false);
		OutsideClassNew superClass = new OutsideClassNew("Kellen", "Connolly");
		
		System.out.println(superClass);
		System.out.println(object2);
		System.out.println(object);
		
		//Shown overriding the superclass method
		object.aMethod();
		object2.aMethod();
		/*
		object.aMethod();
		object2.aMethod();
		*/
	}

}
