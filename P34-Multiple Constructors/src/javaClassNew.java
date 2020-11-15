
public class javaClassNew {
	private int hour;
	private int minute;
	private int second;
	
	public javaClassNew() {
		this(0,0,0);
	}
	
	public javaClassNew(int h) {
		this(h,0,0);
	}
	
	public javaClassNew(int h, int m) {
		this(h,m,0);
	}
	
	public javaClassNew(int h, int m, int s) {
		setTime(h,m,s);
	}
	
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	//Set the date to the variable
	public void setHour(int h) {
		//If hour is between 0-24 print the value, else default to 0
		hour = ((h >= 0 && h < 24) ? h : 0); //conditional if statement
	}
	
	public void setMinute(int m) {
		minute = ((m >= 0 && m < 60) ? m : 0);
	}
	
	public void setSecond(int s) {
		second = ((s >= 0 && s < 60) ? s : 0);
	}
	
	//Return the data that was set
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public String display() {
		return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
	}
	
}
