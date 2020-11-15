
public class javaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaClassNew object = new javaClassNew();
		System.out.println(object.militaryTime());//all 0's
		System.out.println(object.normal());//all default
		
		//Military
		object.setTime(4, 25, 8);//manually set time
		System.out.println(object.militaryTime());//display newly set time
		
		//Standard
		object.setTime(13, 43, 12);//manually set time
		System.out.println(object.normal());//display normal time format

	}

}
