
public class javaClassNew {
	private double a;
	private double p;
	private double r;
	private int t; //time/period of the loan, in years
	
	public javaClassNew(double pr, double ra, int ti) {
		p = pr;
		r = ra;
		t = ti;
	}
	
	public void interestCalculation() {
		for(int year = 0; year <= t; year++) {
			a = p * Math.pow(1 + r, year);
			System.out.println("Year: " + year +", "+ "Amount: " + a);
		}
	}
}
