package ch10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Third extends JFrame{
	private ArrayList<Student> list;
	private JTextField name, grade;
	private JTextArea info;
	
	
	public Third() {
		setSize(250, 250);
		setTitle("학점..");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		list = new ArrayList<Student>();
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
		add(new JLabel("이름"));
		name = new JTextField(15);
		add(name);
		add(new JLabel("성적"));
		grade = new JTextField(15);
		add(grade);
		JButton register = new JButton("등록");
		add(register);
		JButton search = new JButton("검색");
		add(search);
		info = new JTextArea(5, 20);
		info.setEditable(false);
		add(info);
		
		register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String result = "";
				list.add(new Student(name.getText().trim(), grade.getText().trim()));
				
				for(Student s : list)
					result += s.toString() + "\n";
				
				info.setText(result);
				name.setText("");
				grade.setText("");
			}
		});
		
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String result = "";
				String keyName = name.getText().trim();
				String keyGrade = grade.getText().trim();
				
				if(keyName.equals("") && keyGrade.equals(""))
					return;
				
				for(Student s : list) {
					if((keyName.equals("") ||
							s.getName().equals(keyName))
							&& (keyGrade.equals("") ||
									s.getGrade().equals(keyGrade)))
							result += s.toString() + "\n";
				}
				info.setText(result);
			}
		});
	}
	
	public static void main(String[] args) {
		(new Third()).setVisible(true);
	}

}
