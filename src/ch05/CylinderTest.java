package ch05;

public class CylinderTest {

	public static void main(String[] args) {
		Cylinder cy = new Cylinder(5, 8);
		System.out.println(cy);
		System.out.printf("����=%.2f\n", cy.getVolume());
		System.out.printf("�ѳ���=%.2f\n", cy.getSurfaceArea());
		cy.a();
	}

}
