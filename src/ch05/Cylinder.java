package ch05;

public class Cylinder {
	private int r, h;
	
	public Cylinder(int r, int h) {
		this.r = r;
		this.h = h;
	}
	public String toString() {
		return "����� : ������=" + r + ", ����=" + h;
	}
	public void a() {
		System.out.println("��");
	}
	public double getVolume() {
		return r*r*3.1415*h;
	}
	public double getSurfaceArea() {
		return r*2*3.1415*h + 2*3.1415*r*r;
	}
}
