package kr.test.windowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowBuilderTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderTest frame = new WindowBuilderTest();
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
	public WindowBuilderTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[542.00px][356.00px][][][][][]", "[35px][35px][35px][35px][35px][35px][35px][35px][35px][35px][35px][35px][35px][35px][35px][40px]"));
		
		JLabel lblNewLabel = new JLabel("Q1: How fast does a rocket have to go in order to get to space?");
		contentPane.add(lblNewLabel, "cell 0 0,grow");
		
		JLabel lblNewLabel_2 = new JLabel("Q5");
		contentPane.add(lblNewLabel_2, "cell 1 0,grow");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("100 km/h");
		contentPane.add(rdbtnNewRadioButton, "cell 0 1,grow");
		
		JRadioButton radioButton_1 = new JRadioButton("option 1");
		contentPane.add(radioButton_1, "flowx,cell 1 1");
		
		JLabel label = new JLabel("");
		contentPane.add(label, "cell 1 1,grow");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("1000 km/h");
		contentPane.add(rdbtnNewRadioButton_1, "cell 0 2,grow");
		
		JRadioButton radioButton = new JRadioButton("option 2");
		contentPane.add(radioButton, "flowx,cell 1 2");
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1, "cell 1 2,grow");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("27 000 km/h");
		contentPane.add(rdbtnNewRadioButton_2, "cell 0 3,grow");
		
		JRadioButton radioButton_8 = new JRadioButton("option 3");
		contentPane.add(radioButton_8, "flowx,cell 1 3");
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2, "cell 1 3,grow");
		
		JLabel lblNewLabel_1 = new JLabel("Q2: What is the force that pushes rocket forward?");
		contentPane.add(lblNewLabel_1, "cell 0 4,grow");
		
		JLabel lblQ_2 = new JLabel("Q6");
		contentPane.add(lblQ_2, "cell 1 4,grow");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Gravity");
		contentPane.add(rdbtnNewRadioButton_3, "cell 0 5,grow");
		
		JRadioButton radioButton_5 = new JRadioButton("option 1");
		contentPane.add(radioButton_5, "flowx,cell 1 5");
		
		JLabel label_4 = new JLabel("");
		contentPane.add(label_4, "cell 1 5,grow");
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Thrust");
		contentPane.add(rdbtnNewRadioButton_4, "cell 0 6,grow");
		
		JRadioButton radioButton_2 = new JRadioButton("option 2");
		contentPane.add(radioButton_2, "flowx,cell 1 6");
		
		JLabel label_5 = new JLabel("");
		contentPane.add(label_5, "cell 1 6,grow");
		
		JRadioButton radioButton_10 = new JRadioButton("option 3");
		contentPane.add(radioButton_10, "cell 0 7");
		
		JRadioButton radioButton_9 = new JRadioButton("option 3");
		contentPane.add(radioButton_9, "flowx,cell 1 7");
		
		JLabel label_6 = new JLabel("");
		contentPane.add(label_6, "cell 1 7,grow");
		
		JLabel lblQ = new JLabel("Q3: In what altitude the satelites usually work at?");
		contentPane.add(lblQ, "cell 0 8,grow");
		
		JLabel lblQ_3 = new JLabel("Q7");
		contentPane.add(lblQ_3, "cell 1 8,grow");
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("New radio button");
		contentPane.add(rdbtnNewRadioButton_6, "cell 0 9,grow");
		
		JRadioButton radioButton_6 = new JRadioButton("option 1");
		contentPane.add(radioButton_6, "flowx,cell 1 9");
		
		JLabel label_8 = new JLabel("");
		contentPane.add(label_8, "cell 1 9,grow");
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("New radio button");
		contentPane.add(rdbtnNewRadioButton_7, "cell 0 10,grow");
		
		JRadioButton radioButton_3 = new JRadioButton("option 2");
		contentPane.add(radioButton_3, "flowx,cell 1 10");
		
		JLabel label_9 = new JLabel("");
		contentPane.add(label_9, "cell 1 10,grow");
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("New radio button");
		contentPane.add(rdbtnNewRadioButton_8, "cell 0 11,grow");
		
		JRadioButton radioButton_11 = new JRadioButton("option 3");
		contentPane.add(radioButton_11, "flowx,cell 1 11");
		
		JLabel label_10 = new JLabel("");
		contentPane.add(label_10, "cell 1 11,grow");
		
		JLabel lblQ_1 = new JLabel("Q4");
		contentPane.add(lblQ_1, "cell 0 12,grow");
		
		JLabel lblQ_4 = new JLabel("Q8");
		contentPane.add(lblQ_4, "cell 1 12,grow");
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("option 1");
		contentPane.add(rdbtnNewRadioButton_9, "cell 0 13,grow");
		
		JRadioButton radioButton_7 = new JRadioButton("option 1");
		contentPane.add(radioButton_7, "flowx,cell 1 13");
		
		JLabel label_12 = new JLabel("");
		contentPane.add(label_12, "cell 1 13,grow");
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("option 2");
		contentPane.add(rdbtnNewRadioButton_10, "cell 0 14,grow");
		
		JRadioButton radioButton_4 = new JRadioButton("option 2");
		contentPane.add(radioButton_4, "flowx,cell 1 14");
		
		JLabel label_13 = new JLabel("");
		contentPane.add(label_13, "cell 1 14,grow");
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("option 3");
		contentPane.add(rdbtnNewRadioButton_11, "cell 0 15,grow");
		
		JRadioButton radioButton_12 = new JRadioButton("option 3");
		contentPane.add(radioButton_12, "flowx,cell 1 15");
		
		JLabel label_14 = new JLabel("");
		contentPane.add(label_14, "cell 1 15,grow");
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton, "cell 4 15");
		
		JButton btnMainMenu = new JButton("Main Menu");
		contentPane.add(btnMainMenu, "cell 6 15");
	}

}
