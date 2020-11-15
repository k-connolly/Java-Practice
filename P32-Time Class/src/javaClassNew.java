
public class javaClassNew {
	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int h, int m, int s) {
		hour = ((h >= 0 && h < 24) ? h : 0); //Test whether the hour is between 0-24, if not default to 0
		minute = ((m >= 0 && m < 60) ? m : 0);//Test whether the minute is between 0-60, if not default to 0
		second = ((s >= 0 && s < 60) ? s : 0);//Test whether the second is between 0-60, if not default to 0
		
	}
	
	public String militaryTime() {
		return String.format("%02d:%02d:%02d", hour, minute, second);//format of the time
	}
	
	public String normal() {
		return String.format("%d:%02d:%02d %s", ((hour==0||hour==12) ? 12:hour%12), minute, second, (hour<12? "AM" : "PM"));
	}
}
