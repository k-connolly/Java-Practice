
public class javaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaClassNew object = new javaClassNew(10, 5);
		OutsideClass person = new OutsideClass("Kellen","Connolly", 21);
		
		for(int i = 0; i < 5; i++) { //loop # of times
			object.add();//adds # each time loops
			System.out.printf("%s",object);//format output
		}
		
		for(int i = 0; i < 3; i++) {
			object.subtract();
			System.out.printf("%s",object);
		}
		
		System.out.println(person);//to string method prints details instead having to call methods
	}

}
