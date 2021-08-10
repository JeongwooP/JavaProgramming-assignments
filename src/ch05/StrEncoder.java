package ch05;

public class StrEncoder {
	private int add;
	private char letter;
	private String newS, anoS;
	public StrEncoder(int add) {
		this.add = add;
	}
	public String encode(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				letter = (char)(str.charAt(i) + add);
				if(letter > 90)
					letter = (char)(64 + (letter - 90));
				System.out.println(letter);
				newS += Character.toString(letter);
			}
			else if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				letter = (char)(str.charAt(i) + add);
				if(letter > 122)
					letter = (char)(96 + (letter - 122));
				newS += Character.toString(letter);
			}
		}
		return  newS;
	}
	
	public String decode(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				letter = (char)(str.charAt(i) - add);
				if(letter < 65)
					letter = (char)(91 - (65 - letter));
				anoS += Character.toString(letter);
			}
			else if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				letter = (char)(str.charAt(i) - add);
				if(letter < 97)
					letter = (char)(123 - (97 - letter));
				anoS += Character.toString(letter);
			}
		}
		return  anoS;
	}
}
