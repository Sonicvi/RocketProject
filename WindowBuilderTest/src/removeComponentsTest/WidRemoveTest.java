package removeComponentsTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WidRemoveTest extends JFrame {
	JPanel panel;
	JButton but;
	JLabel la;
	JButton sacrificeBut;

	public static void main(String[] args) {
		WidRemoveTest wRT= new WidRemoveTest();
		wRT.go();

	}
	
	
	public void go(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		this.add(panel);
		but=new JButton("destroy the other button");
		panel.add(but);
		but.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e) {
//					if(e.getSource().equals(but)){
//					panel.remove(sacrificeBut);
//					}
					panel.remove(sacrificeBut);
					panel.repaint();
					panel.add(new JButton("Hi there"));
					panel.revalidate();
					}
				});
		la=new JLabel("destroy test");
		panel.add(la);
		
		sacrificeBut= new JButton("kill me please!(click the other button)");
		panel.add(sacrificeBut);
		
		this.setSize(300,300);
		this.setVisible(true);
	}


	

}
