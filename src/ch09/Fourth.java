package ch09;

import java.io.IOException;

public class Fourth {

	public static void main(String[] args) {
		String[] blocks = new String[7]; 
		String sentence = "";
		int i = 0;
		boolean sw = true;
		System.out.println("문자를 입력하시오.");
		try {
			while(true) {
			char word = (char)System.in.read();
			if(word != ' ') {
				sentence += String.valueOf(word);
				sw = false;
			}
			else if(word == ' ' && sw == false) {
				sw = !sw; //true
				blocks[i] = sentence;
				i++; //7
				sentence = "";
			}
				
			if(word == '\n') {
				blocks[i] = sentence;
				break;
			}
			}
		}catch(IOException e){
			System.out.println(e);
		}
		for(int k = 0 ; k < blocks.length ; k++)
		System.out.print(k+1 + ": " + blocks[k] + "\n");
	}

}
