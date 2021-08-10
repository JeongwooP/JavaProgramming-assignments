package ch04;

public class Patient {
	String name;
	int height, weight;
	
	public Patient(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBMI() {
		return weight / ((height * 0.01) * (height * 0.01));
	}
	
	public String getDiagnosis() {
		if(getBMI()>= 25)
			return "��";
		else if(getBMI() >= 23)
			return "��ü��";
		else if(getBMI() >= 18.5)
			return "����";
		else
			return "��ü��";
	}
}
