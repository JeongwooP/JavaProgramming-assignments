package report3;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Word extends JFrame{

	public Word() {
		String word = JOptionPane.showInputDialog("이름을 입력하시오.");
		String sizeS = JOptionPane.showInputDialog("폰트 사이즈를 정수로 입력하시오.");
		int sizeI = Integer.parseInt(sizeS);
		
		setSize(500, 250);
		setTitle("입력");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cPane = getContentPane();
		cPane.setBackground(Color.YELLOW);

		cPane.setLayout(new FlowLayout());
		JLabel label = new JLabel(word+"님,반갑습니다!");
		label.setFont(new Font("굴림", Font.BOLD, sizeI));
		label.setForeground(Color.blue);
		cPane.add(label);
		setTitle("Name Fontsize Example");
	}

}
