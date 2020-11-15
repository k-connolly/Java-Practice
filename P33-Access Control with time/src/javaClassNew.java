
public class javaClassNew {
	//THESE ARE INSTANCE VARIABLES
	private int hour = 1;
	private int minute = 2;
	private int second = 3;
	
	public void setTime(int hour, int minute, int second) {//use these current parameters for this.
		//Assign the parameter values to the global values of the class temporarily
		//the this command is used to access instance variables of the class and not local
		//In this situation we are taking the parameters and using the this command to
		//assign them to the Instance/global variables of the class.
		this.hour = hour;//use parameter values instead of private class values
		this.minute = minute;//use parameter values instead of private class values
		this.second = second;//use parameter values instead of private class values
	}
	
	public String militaryTime() {
		return String.format("%02d:%02d:%02d", hour, minute, second);//format of the time
	}
	
	public String normal() {
		return String.format("%d:%02d:%02d %s", ((hour==0||hour==12) ? 12:hour%12), minute, second, (hour<12? "AM" : "PM"));
	}
}
