
public class javaClassNew {
	private String fishName;
	private int fishAge;
	
	//Initializes the variables, if no value from
	//parameters, it returns null values
	/*
	 * Constructor
	 */
	public javaClassNew(String name, int age) {
		fishName = name;
		fishAge = age;
	}
	
	/* Not Needed currently. constructor does job
	public void setName(String name) {
		fishName = name;
	}
	*/
	public String getName() {
		return fishName;
	}
	
	public int getAge() {
		return fishAge;
	}
	
	public void message() {
		System.out.printf("Fish name is: %s\n", getName());
		System.out.printf("Fish age is: %s\n", getAge());
	}
}
