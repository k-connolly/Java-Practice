
public class javaClass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * object is reference variable which controls
		 * the stuff from the outsideClass()
		 * outsideClass in the beginning is the data type, meaning
		 * the 'object' is of the type 'outsideClass'
		 */
		outsideClass object = new outsideClass();
		
		/*
		 * 'outsideClass' is now part of the 'outsideClassNew'
		 * data type, anything that inherits from the super class
		 * can now be assigned to the object reference variable
		 * You can now use all methods that are within the super and
		 * the 'outsideClass'
		 */
		outsideClassNew object2 = new outsideClass();
		
		
		/*
		 * Polymorphic Array
		 */
		//Can hold objects of all sub classes of the super class
		outsideClassNew polyArray[] = new outsideClassNew[2];
		polyArray[0] = new javaClassNew();
		polyArray[1] = new outsideClass();
		
		//Loop through array of objects
		for(int i = 0; i < 2; i++) {
			//prints out the method message from each 
			//object it iterates over.
			polyArray[i].display();
		}
		
		System.out.println();//spacer
		
		furtherClass object3 = new furtherClass();
		outsideClassNew object4 = new outsideClassNew();//super class, need it for furtherClass parameter
		object3.broadcast(object4);
		
		outsideClassNew object5 = new javaClassNew();
		object3.broadcast(object5);
	}

}
