package removeComponentsTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FillInTheBlanksRocketDesign extends JFrame {

	private JPanel contentPane;
	private JTextField textField_structure;
	private JTextField textField_guidance;
	private JTextField textField_propulsion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FillInTheBlanksRocketDesign frame = new FillInTheBlanksRocketDesign();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame .
	 */
	public FillInTheBlanksRocketDesign() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel textPanel = new JPanel();
		
		JPanel choicesButtonPanel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textPanel, GroupLayout.PREFERRED_SIZE, 634, GroupLayout.PREFERRED_SIZE)
						.addComponent(choicesButtonPanel, GroupLayout.PREFERRED_SIZE, 633, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(610, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(textPanel, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(choicesButtonPanel, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(160, Short.MAX_VALUE))
		);
		
		JLabel lblBlank = new JLabel("Blank_2");
		
		JLabel lblNewLabel_1 = new JLabel("Blank_1");
		
		JLabel lblNewLabel_2 = new JLabel("Blank_0");
		
		textField_structure = new JTextField();
		textField_structure.setColumns(10);
		
		textField_guidance = new JTextField();
		textField_guidance.setColumns(10);
		
		textField_propulsion = new JTextField();
		textField_propulsion.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_structure.getText().equals("structure")&&textField_guidance.getText().equals("guidance")
						&&textField_propulsion.getText().equals("Propulsion")){
					JOptionPane.showMessageDialog(null, "Correct!");
				}
				else{
					JOptionPane.showMessageDialog(null, "Wrong!");
				}
			}
		});
		
		JButton btnNewButton = new JButton("Main Menu");
		
		JButton btnNewButton_1 = new JButton("Previous");
		GroupLayout gl_choicesButtonPanel = new GroupLayout(choicesButtonPanel);
		gl_choicesButtonPanel.setHorizontalGroup(
			gl_choicesButtonPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_choicesButtonPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_choicesButtonPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_choicesButtonPanel.createSequentialGroup()
							.addComponent(lblBlank)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_propulsion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSubmit)
							.addPreferredGap(ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
							.addComponent(btnNewButton_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton))
						.addGroup(gl_choicesButtonPanel.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_guidance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_choicesButtonPanel.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_structure, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_choicesButtonPanel.setVerticalGroup(
			gl_choicesButtonPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_choicesButtonPanel.createSequentialGroup()
					.addContainerGap(187, Short.MAX_VALUE)
					.addGroup(gl_choicesButtonPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_structure, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_choicesButtonPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_guidance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_choicesButtonPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBlank)
						.addComponent(textField_propulsion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSubmit)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addContainerGap())
		);
		choicesButtonPanel.setLayout(gl_choicesButtonPanel);
		
		JLabel lblNewLabel = new JLabel("<html>The (Blank_0) is the frame of the rocket. <br>The (Blank_1) portion of a rocket helps to keep the rocket stable during takeoff and controls the rocket when it needs to move.<br>(Blank_2) is the part that moves the rocket towards the sky.");
		GroupLayout gl_textPanel = new GroupLayout(textPanel);
		gl_textPanel.setHorizontalGroup(
			gl_textPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_textPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 619, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_textPanel.setVerticalGroup(
			gl_textPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_textPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		textPanel.setLayout(gl_textPanel);
		contentPane.setLayout(gl_contentPane);
	}

}
