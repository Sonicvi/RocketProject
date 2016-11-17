import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Listener extends JFrame implements ActionListener {
	
	 	JButton confirmButton;			
	    JLabel feedbackLabel;
	    JLabel questionLabel;
	    JPanel panel;
	    JRadioButton option1;
        JRadioButton option2;
        ButtonGroup gruppe;
	
	public Listener(){
		this.setTitle("ActionListener Beispiel");
        this.setSize(400, 200);
		
		JFrame meinJFrame = new JFrame();
		meinJFrame.setDefaultCloseOperation(meinJFrame.EXIT_ON_CLOSE);
		
        meinJFrame.setTitle("JButton Beispiel");
        JPanel panel = new JPanel();
        
        
 
        // JButton with text "confirm" is created
        confirmButton = new JButton("confirm");
         feedbackLabel= new JLabel();
         questionLabel= new JLabel("Can rockets fly to the moon?");
         
         option1 = new JRadioButton("yes");
         option2 = new JRadioButton("no");
        
        ButtonGroup gruppe = new ButtonGroup();
        
        //JRadioButtons added to ButtonGroup 
        gruppe.add(option1);
        gruppe.add(option2);
        
        confirmButton.addActionListener(this);
        
        panel.add(confirmButton);
        panel.add(feedbackLabel);
        
        panel.add(option1);
        panel.add(option2);
        
        panel.add(feedbackLabel);
        this.add(panel);
        
       
	}

	public static void main(String[] args) {
		
		Listener bl = new Listener();
        bl.setVisible(true);
	        
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		//no general solution, because we can not loop through the button group
		//I have to tell which button is correct
		if(ae.getSource()==this.confirmButton){
			if(option1.isSelected()){
				feedbackLabel.setText("correct");
			}
			if(option2.isSelected()){
				feedbackLabel.setText("incorrect");
			}
		}
			
	}

}
