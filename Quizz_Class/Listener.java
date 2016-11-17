import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Listener extends JFrame implements ActionListener {
	
	 	JButton button;			
	    JLabel label;
	    JPanel panel;
	    JRadioButton auswahl1;
        JRadioButton auswahl2;
        ButtonGroup gruppe;
	
	public Listener(){
		this.setTitle("ActionListener Beispiel");
        this.setSize(400, 200);
		
		JFrame meinJFrame = new JFrame();
		meinJFrame.setDefaultCloseOperation(meinJFrame.EXIT_ON_CLOSE);
		
        meinJFrame.setTitle("JButton Beispiel");
        JPanel panel = new JPanel();
        
        
 
        // JButton mit Text "Drück mich" wird erstellt
        button = new JButton("Drück mich");
         label= new JLabel("Hallo");
         auswahl1 = new JRadioButton("gelb");
         auswahl2 = new JRadioButton("blau");
        
        ButtonGroup gruppe = new ButtonGroup();
        
        //JRadioButtons werden zur ButtonGroup hinzugefügt
        gruppe.add(auswahl1);
        gruppe.add(auswahl2);
        
        button.addActionListener(this);
        
        panel.add(button);
        panel.add(label);
        
        panel.add(auswahl1);
        panel.add(auswahl2);
        
        panel.add(label);
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
		if(ae.getSource()==this.button){
			if(auswahl1.isSelected()){
				label.setText("correct");
			}
			if(auswahl2.isSelected()){
				label.setText("incorrect");
			}
		}
			
	}

}
