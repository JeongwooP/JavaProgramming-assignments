package ch08;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame{
   private JRadioButton rtn1,rtn2,rtn3;
   private JLabel tf;
   private Container cnp;
   private ButtonGroup bg;
   
   public RadioButton() {
      setSize(200,200); 
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle("Radiobtn Test");
      cnp = getContentPane();
      cnp.setLayout(new FlowLayout());
      
      bg = new ButtonGroup();
      rtn1 = new JRadioButton("Red");
      rtn1.setOpaque(false);
      rtn1.addItemListener(new EventHandler());
      rtn2 = new JRadioButton("Green");
      rtn2.setOpaque(false);
      rtn2.addItemListener(new EventHandler());
      rtn3 = new JRadioButton("Blue");
      rtn3.setOpaque(false);
      rtn3.addItemListener(new EventHandler());
      bg.add(rtn1);
      bg.add(rtn2);
      bg.add(rtn3);
      tf = new JLabel("������ ���õ��� �ʾҽ��ϴ�.");
      
      cnp.add(rtn1);
      cnp.add(rtn2);
      cnp.add(rtn3);
      cnp.add(tf);
      
   }
   
   public class EventHandler implements ItemListener{
      @Override
      public void itemStateChanged(ItemEvent e) {
         if(rtn1.isSelected()) {
            cnp.setBackground(Color.red);
            tf.setText("Red��(��)���õǾ����ϴ�.");
         }
         else if(rtn2.isSelected()) {
            cnp.setBackground(Color.green);
            tf.setText("Green��(��)���õǾ����ϴ�.");
         }
         else if(rtn3.isSelected()) {
            cnp.setBackground(Color.BLUE);
            tf.setText("Blue��(��)���õǾ����ϴ�.");
         }
      }
   }
   
   
   public static void main(String[] args) {
      (new RadioButton()).setVisible(true);

   }

}