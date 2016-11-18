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
        ButtonGroup buttonGroup;
        
	
	public Listener(){
		
		this.setTitle("True/False questions");
        this.setSize(400, 200);
		
        //create and add the panel to the frame
        JPanel panel = new JPanel();
        this.add(panel);
        
 
        // JButton with text "confirm" is created
        //and registered
        confirmButton = new JButton("confirm");
        panel.add(confirmButton);
        confirmButton.addActionListener(this);
        
        //feedback label is added
         feedbackLabel= new JLabel();
         panel.add(feedbackLabel);
         
         //The actual question is added
         questionLabel= new JLabel();
         questionLabel.setText("Can rockets fly to the moon?");
         panel.add(questionLabel);
         
         //Radio button group is created and added
         //Multiple choice buttons (Radio buttons are created)possible choices
         //
         ButtonGroup gruppe = new ButtonGroup();
         option1 = new JRadioButton("yes");
         gruppe.add(option1);
         panel.add(option1);
         
         option2 = new JRadioButton("no");
         gruppe.add(option2);
         panel.add(option2);
     
        
       
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
