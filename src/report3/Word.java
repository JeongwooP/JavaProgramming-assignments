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
		String word = JOptionPane.showInputDialog("�̸��� �Է��Ͻÿ�.");
		String sizeS = JOptionPane.showInputDialog("��Ʈ ����� ������ �Է��Ͻÿ�.");
		int sizeI = Integer.parseInt(sizeS);
		
		setSize(500, 250);
		setTitle("�Է�");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cPane = getContentPane();
		cPane.setBackground(Color.YELLOW);

		cPane.setLayout(new FlowLayout());
		JLabel label = new JLabel(word+"��,�ݰ����ϴ�!");
		label.setFont(new Font("����", Font.BOLD, sizeI));
		label.setForeground(Color.blue);
		cPane.add(label);
		setTitle("Name Fontsize Example");
	}

}
