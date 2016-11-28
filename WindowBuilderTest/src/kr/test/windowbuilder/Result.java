package kr.test.windowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.FormSpecs;
//import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Result extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question frame = new Question();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Result() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Q1: How fast does a rocket have to go in order to get to space?");
		
		JLabel lblNewLabel_2 = new JLabel("Q5");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("100 km/h");
		
		JRadioButton radioButton_1 = new JRadioButton("option 1");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("1000 km/h");
		
		JRadioButton radioButton = new JRadioButton("option 2");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("27 000 km/h");
		
		JRadioButton radioButton_8 = new JRadioButton("option 3");
		
		JLabel lblNewLabel_1 = new JLabel("Q2: What is the force that pushes rocket forward?");
		
		JLabel lblQ_2 = new JLabel("Q6");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Gravity");
		
		JRadioButton radioButton_5 = new JRadioButton("option 1");
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Thrust");
		
		JRadioButton radioButton_2 = new JRadioButton("option 2");
		
		JRadioButton radioButton_10 = new JRadioButton("option 3");
		
		JRadioButton radioButton_9 = new JRadioButton("option 3");
		
		JLabel lblQ = new JLabel("Q3: In what altitude the satelites usually work at?");
		
		JLabel lblQ_3 = new JLabel("Q7");
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("option 1");
		
		JRadioButton radioButton_6 = new JRadioButton("option 1");
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("option 2");
		
		JRadioButton radioButton_3 = new JRadioButton("option 2");
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("option 3");
		
		JRadioButton radioButton_11 = new JRadioButton("option 3");
		
		JLabel lblQ_1 = new JLabel("Q4");
		
		JLabel lblQ_4 = new JLabel("Q8");
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("option 1");
		
		JRadioButton radioButton_7 = new JRadioButton("option 1");
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("option 2");
		
		JRadioButton radioButton_4 = new JRadioButton("option 2");
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("option 3");
		
		JRadioButton radioButton_12 = new JRadioButton("option 3");
		
		JButton btnNewButton = new JButton("Show correct answers");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnMainMenu = new JButton("Main Menu");
		
		JLabel lblResult = DefaultComponentFactory.getInstance().createTitle("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(546)
							.addComponent(radioButton_2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(546)
							.addComponent(radioButton_9))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblQ, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(lblQ_3, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton_6, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(radioButton_6))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton_7, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(radioButton_3))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton_8, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(radioButton_11))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblQ_1, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(lblQ_4, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton_9, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(radioButton_7))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton_10, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(radioButton_4))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton_11, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(radioButton_12)
							.addGap(280)
							.addComponent(btnNewButton)
							.addGap(18)
							.addComponent(btnMainMenu))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(546)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
												.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
												.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
												.addComponent(rdbtnNewRadioButton_2, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(rdbtnNewRadioButton_3, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
												.addComponent(rdbtnNewRadioButton_4, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
												.addComponent(radioButton_10)
												.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE)))
										.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(radioButton_8)
												.addComponent(radioButton)
												.addComponent(radioButton_1))
											.addGap(265))
										.addComponent(lblQ_2, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)))
								.addComponent(radioButton_5))))
					.addGap(10))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(1282, Short.MAX_VALUE)
					.addComponent(lblResult)
					.addGap(530))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblResult)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton_1)
						.addComponent(rdbtnNewRadioButton_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton)
						.addComponent(rdbtnNewRadioButton_4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton_8)
						.addComponent(radioButton_10))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQ_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addComponent(radioButton_5)
					.addGap(10)
					.addComponent(radioButton_2)
					.addGap(10)
					.addComponent(radioButton_9)
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblQ, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblQ_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(radioButton_6)))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(radioButton_3)))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_8, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(radioButton_11)))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblQ_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblQ_4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_9, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(radioButton_7)))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_10, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(radioButton_4)))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_11, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(radioButton_12))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnMainMenu, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))))
		);
		contentPane.setLayout(gl_contentPane);
	}
}