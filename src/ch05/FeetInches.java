package ch05;

public class FeetInches {
	public static final double inCH_in_CENTI = 2.54;
	private int ft;
	private int in;
	
	public FeetInches() {
		setLength(0,0);
	}
	public FeetInches(int ft, int in) {
		setLength(ft, in);
	}
	public FeetInches(String str) {
		int ft=0, in=0;
		int indexFt = str.indexOf('\'');
		if(indexFt > 0)
			ft = Integer.parseInt(str.substring(0, indexFt).trim());
		int indexIn = str.indexOf("\"");
		if(indexIn > indexFt)
			in = Integer.parseInt(str.substring(indexFt+1, indexIn).trim());
		setLength(ft, in);
	}
	public void setLength(int ft, int in) {
		this.ft = ft;
		this.in = in;
	}
	public String toString() {
		return ft + "피트" + in + "인치";
	}
	public double getCentiMeter() {
		return ft * 12 * inCH_in_CENTI + in * inCH_in_CENTI;
	}
	public FeetInches plus(FeetInches len2) {
		FeetInches tmp = new FeetInches();
		int carry = (this.in + len2.in) / 12;
		tmp.in = (this.in + len2.in) % 12;
		tmp.ft = this.ft + len2.ft + carry;
		return tmp;
	}
	public FeetInches times(int n) {
		FeetInches tmp = new FeetInches();
		int carry = this.in * n / 12;
		tmp.in = this.in * n % 12;
		tmp.ft = this.ft * n + carry;
		return tmp;
	}	
	public FeetInches minus(FeetInches len2) {
		FeetInches len3 = new FeetInches();
		len3.ft = this.ft - len2.ft;
		len3.in = this.in - len2.in;
		if(len3.in < 0) {
			len3.ft--;
			len3.in = 12 + len3.in;
		}
		return len3;
	}
}
