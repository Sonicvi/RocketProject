


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
public class FillInTheBlanksRocketPhysics extends JFrame {
	private JPanel contentPane;
	private JTextField blank_0_textfield;
	private JTextField blank_1_textfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FillInTheBlanksRocketPhysics frame = new FillInTheBlanksRocketPhysics();
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
	public FillInTheBlanksRocketPhysics() {
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
						.addComponent(choicesButtonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPanel, GroupLayout.PREFERRED_SIZE, 634, GroupLayout.PREFERRED_SIZE))
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
		
		JLabel blank_1 = new JLabel("Blank_1");
		
		JLabel blank_0 = new JLabel("Blank_0");
		
		blank_0_textfield = new JTextField();
		blank_0_textfield.setColumns(10);
		
		blank_1_textfield = new JTextField();
		blank_1_textfield.setColumns(10);
		
		JButton btnNewButton = new JButton("Main Menu");
		
		JButton btnNewButton_1 = new JButton("Next");
		
		JButton btnNewButton_2 = new JButton("Previous");
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(blank_0_textfield.getText().equals("action")&&blank_1_textfield.getText().equals("opposite")){
					JOptionPane.showMessageDialog(null, "Correct!");
				}
				else{
					JOptionPane.showMessageDialog(null, "Wrong!");
				}
			}
		});
		GroupLayout gl_choicesButtonPanel = new GroupLayout(choicesButtonPanel);
		gl_choicesButtonPanel.setHorizontalGroup(
			gl_choicesButtonPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_choicesButtonPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_choicesButtonPanel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_choicesButtonPanel.createSequentialGroup()
							.addGroup(gl_choicesButtonPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_choicesButtonPanel.createSequentialGroup()
									.addComponent(blank_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(blank_1_textfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_choicesButtonPanel.createSequentialGroup()
									.addComponent(blank_0)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(blank_0_textfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(496))
						.addGroup(Alignment.LEADING, gl_choicesButtonPanel.createSequentialGroup()
							.addComponent(btnSubmit)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnNewButton_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton)
							.addGap(137))))
		);
		gl_choicesButtonPanel.setVerticalGroup(
			gl_choicesButtonPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_choicesButtonPanel.createSequentialGroup()
					.addContainerGap(166, Short.MAX_VALUE)
					.addGroup(gl_choicesButtonPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(blank_0)
						.addComponent(blank_0_textfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_choicesButtonPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(blank_1)
						.addComponent(blank_1_textfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_choicesButtonPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSubmit)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2))
					.addContainerGap())
		);
		choicesButtonPanel.setLayout(gl_choicesButtonPanel);
		
		JLabel lblNewLabel = new JLabel("<html> Newton's third law states,<br> that for every (Blank_0) there is a reaction of (Blank_1) direction and equal magnitude.");
		GroupLayout gl_textPanel = new GroupLayout(textPanel);
		gl_textPanel.setHorizontalGroup(
			gl_textPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_textPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 458, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(166, Short.MAX_VALUE))
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
