
public class javaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaClassNew member1 = new javaClassNew("Kellen","Connolly");
		javaClassNew member2 = new javaClassNew("Brianna","Martin");
		javaClassNew member3 = new javaClassNew("Ruby","Martin");
		javaClassNew member4 = new javaClassNew("Newt","Martin");
		
		System.out.printf("%s\n%s\n%s\n%s\n",member1,member2,member3,member4);
		
		
		//Each member has its own set of data, while
		//shared the members count 'data'.
		System.out.println();
		System.out.println(member1.getFirst());//unique
		System.out.println(member1.getLast());//unique
		System.out.println(member1.getMembers());//shared with all objects
		
		
		System.out.println(javaClassNew.getMembers());//can access static methods through the class
	}

}
