
public class encapsulation {
	private int ssn;
	private String name;
	private int age;
	
	//Constructor encapsulation example
	/*
	public encapsulation(int ssn, String empName, int age) {
		this.ssn = ssn;
		this.empName = empName;
		this.age = age;
	}
	
	public void information() {
		System.out.println("Employee Information:");
		System.out.println(ssn);
		System.out.println(empName);
		System.out.println(age);
	}
	*/
	//----------------------------------//
	
	//Setters encapsulation
	public void setSSN(int ssn) {
		this.ssn = ssn;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Getters encapsulation
	public int getSSN() {
		return ssn;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
