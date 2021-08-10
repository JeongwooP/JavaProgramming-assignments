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

public class Fourth extends JFrame{
   private JRadioButton bRed,bGreen,bBlue;
   private JLabel label;
   private Container cpane;
   private ButtonGroup bg;
   
   public Fourth() {
      setSize(200,200);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle("Radiobtn Test");
      cpane = getContentPane();
      cpane.setLayout(new FlowLayout());
      
      bRed = new JRadioButton("Red");
      bRed.setOpaque(false);
      bRed.addItemListener(new EventHandler());
      bGreen = new JRadioButton("Green");
      bGreen.setOpaque(false);
      bGreen.addItemListener(new EventHandler());
      bBlue = new JRadioButton("Blue");
      bBlue.setOpaque(false);
      bBlue.addItemListener(new EventHandler());
      
      bg = new ButtonGroup();
      bg.add(bRed);
      bg.add(bGreen);
      bg.add(bBlue);
      label = new JLabel("색상이 선택되지 않았습니다.");
      
      cpane.add(bRed);
      cpane.add(bGreen);
      cpane.add(bBlue);
      cpane.add(label);
      
   }
   
   public class EventHandler implements ItemListener{
      @Override
      public void itemStateChanged(ItemEvent e) {
         if(bRed.isSelected()) {
        	 cpane.setBackground(Color.red);
        	 label.setText("Red이(가)선택되었습니다.");
         }
         else if(bGreen.isSelected()) {
        	 cpane.setBackground(Color.green);
        	 label.setText("Green이(가)선택되었습니다.");
         }
         else if(bBlue.isSelected()) {
        	 cpane.setBackground(Color.BLUE);
        	 label.setText("Blue이(가)선택되었습니다.");
         }
      }
   }
   
   
   public static void main(String[] args) {
      (new Fourth()).setVisible(true);

   }

}