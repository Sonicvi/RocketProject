package removeComponentsTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FillInTheBlanksWhatIsARocket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FillInTheBlanksWhatIsARocket frame = new FillInTheBlanksWhatIsARocket();
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
	public FillInTheBlanksWhatIsARocket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel fillInTheBlanksText = new JPanel();
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(fillInTheBlanksText, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 631, GroupLayout.PREFERRED_SIZE))
					.addGap(613))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(fillInTheBlanksText, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
					.addGap(66)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(297, Short.MAX_VALUE))
		);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblBlank_2 = new JLabel("Blank_3");
		
		JLabel lblBlank_1 = new JLabel("Blank_2");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblBlank = new JLabel("Blank_1");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("Chinese")&&textField_1.getText().equals("USSR")
						&&textField_2.getText().equals("moon")){
					JOptionPane.showMessageDialog(null, "Correct!");
				}
				else{
					JOptionPane.showMessageDialog(null, "Wrong!");
				}
			}
		});
		
		JButton btnPrevious = new JButton("Previous");
		
		JButton btnMainMenu = new JButton("Main Menu");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblBlank_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnSubmit)
							.addPreferredGap(ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
							.addComponent(btnPrevious)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnMainMenu)
							.addGap(3))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblBlank_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblBlank)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(494, Short.MAX_VALUE))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(42, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBlank)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBlank_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBlank_2)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSubmit)
						.addComponent(btnPrevious)
						.addComponent(btnMainMenu))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JLabel lblNewLabel = new JLabel("<html>Rockets have been used first by (Blank_1) soldiers in 1232 in fights against Mongols.<br>However, these rockets could not fly to space. In 1957 (Blank_2) brought Sputnik 1 to space with a rocket.<br>In July 1969 a Rocket brought Neil Armstrong to the (Blank_3). He became the first person on the moon.<br>The engine of a rocket use fuel and oxygen in order to move the rocket.<br>Due to Newtons three motion laws, the rocket can even move in space. ");
		GroupLayout gl_fillInTheBlanksText = new GroupLayout(fillInTheBlanksText);
		gl_fillInTheBlanksText.setHorizontalGroup(
			gl_fillInTheBlanksText.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fillInTheBlanksText.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(256, Short.MAX_VALUE))
		);
		gl_fillInTheBlanksText.setVerticalGroup(
			gl_fillInTheBlanksText.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fillInTheBlanksText.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(61, Short.MAX_VALUE))
		);
		fillInTheBlanksText.setLayout(gl_fillInTheBlanksText);
		contentPane.setLayout(gl_contentPane);
	}
}
