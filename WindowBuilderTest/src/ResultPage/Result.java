package ResultPage;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Result extends JFrame {
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	private final ButtonGroup buttonGroup_7 = new ButtonGroup();
	private final ButtonGroup buttonGroup_8 = new ButtonGroup();
	private final ButtonGroup buttonGroup_9 = new ButtonGroup();
	private final ButtonGroup buttonGroup_10 = new ButtonGroup();
	private final ButtonGroup buttonGroup_11 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result frame = new Result();
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
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		
		JPanel panel_3 = new JPanel();
		
		JPanel panel_4 = new JPanel();
		
		JPanel panel_5 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 1254, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 1254, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 1254, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 1254, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1244, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1254, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		
		JLabel lblScore = new JLabel("Score:");
		
		JLabel lblResult = new JLabel("Result");
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblScore, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(368)
					.addComponent(lblResult)
					.addContainerGap(759, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblScore)
						.addComponent(lblResult))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		
		JButton btnNewButton_1 = new JButton("Main menu");
		
		JButton btnNewButton_2 = new JButton("Back");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
					.addContainerGap(1104, Short.MAX_VALUE)
					.addComponent(btnNewButton_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1)
					.addGap(6))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
					.addContainerGap(88, Short.MAX_VALUE)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2))
					.addContainerGap())
		);
		panel_4.setLayout(gl_panel_4);
		
		JLabel lblQuestion_9 = new JLabel("Question_10");
		
		JRadioButton rdbtnNewRadioButton_34 = new JRadioButton("answer_101");
		buttonGroup_9.add(rdbtnNewRadioButton_34);
		
		JRadioButton rdbtnNewRadioButton_35 = new JRadioButton("answer_102");
		buttonGroup_9.add(rdbtnNewRadioButton_35);
		
		JRadioButton rdbtnNewRadioButton_36 = new JRadioButton("answer_103");
		buttonGroup_9.add(rdbtnNewRadioButton_36);
		
		JRadioButton rdbtnNewRadioButton_37 = new JRadioButton("answer_104");
		buttonGroup_9.add(rdbtnNewRadioButton_37);
		
		JLabel lblQuestion_10 = new JLabel("Question_11");
		
		JRadioButton rdbtnNewRadioButton_38 = new JRadioButton("answer_111");
		buttonGroup_10.add(rdbtnNewRadioButton_38);
		
		JRadioButton rdbtnNewRadioButton_39 = new JRadioButton("answer_112");
		buttonGroup_10.add(rdbtnNewRadioButton_39);
		
		JRadioButton rdbtnNewRadioButton_40 = new JRadioButton("answer_113");
		buttonGroup_10.add(rdbtnNewRadioButton_40);
		
		JRadioButton rdbtnNewRadioButton_41 = new JRadioButton("answer_114");
		buttonGroup_10.add(rdbtnNewRadioButton_41);
		
		JLabel lblQuestion_11 = new JLabel("Question_12");
		
		JRadioButton rdbtnNewRadioButton_42 = new JRadioButton("answer_121");
		buttonGroup_11.add(rdbtnNewRadioButton_42);
		
		JRadioButton rdbtnNewRadioButton_43 = new JRadioButton("answer_122");
		buttonGroup_11.add(rdbtnNewRadioButton_43);
		
		JRadioButton rdbtnNewRadioButton_44 = new JRadioButton("answer_123");
		buttonGroup_11.add(rdbtnNewRadioButton_44);
		
		JRadioButton rdbtnNewRadioButton_45 = new JRadioButton("answer_124");
		buttonGroup_11.add(rdbtnNewRadioButton_45);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblQuestion_9)
						.addComponent(rdbtnNewRadioButton_34)
						.addComponent(rdbtnNewRadioButton_35)
						.addComponent(rdbtnNewRadioButton_36)
						.addComponent(rdbtnNewRadioButton_37))
					.addPreferredGap(ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblQuestion_10)
						.addComponent(rdbtnNewRadioButton_38)
						.addComponent(rdbtnNewRadioButton_39)
						.addComponent(rdbtnNewRadioButton_40)
						.addComponent(rdbtnNewRadioButton_41))
					.addGap(289)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
							.addComponent(rdbtnNewRadioButton_45)
							.addComponent(rdbtnNewRadioButton_44)
							.addComponent(rdbtnNewRadioButton_43))
						.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
							.addComponent(rdbtnNewRadioButton_42)
							.addComponent(lblQuestion_11)))
					.addGap(303))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblQuestion_10)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_38)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_39)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_40)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_41))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblQuestion_9)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_34)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_35)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_36)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_37))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblQuestion_11)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_42)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_43)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_44)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_45)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JLabel lblQuestion_6 = new JLabel("Question_7");
		
		JRadioButton rdbtnNewRadioButton_22 = new JRadioButton("answer_71");
		buttonGroup_6.add(rdbtnNewRadioButton_22);
		
		JRadioButton rdbtnNewRadioButton_23 = new JRadioButton("answer_72");
		buttonGroup_6.add(rdbtnNewRadioButton_23);
		
		JRadioButton rdbtnNewRadioButton_24 = new JRadioButton("answer_73");
		buttonGroup_6.add(rdbtnNewRadioButton_24);
		
		JRadioButton rdbtnNewRadioButton_25 = new JRadioButton("answer_74");
		buttonGroup_6.add(rdbtnNewRadioButton_25);
		
		JLabel lblQuestion_7 = new JLabel("Question_8");
		
		JRadioButton rdbtnNewRadioButton_26 = new JRadioButton("answer_81");
		buttonGroup_7.add(rdbtnNewRadioButton_26);
		
		JRadioButton rdbtnNewRadioButton_27 = new JRadioButton("answer_82");
		buttonGroup_7.add(rdbtnNewRadioButton_27);
		
		JRadioButton rdbtnNewRadioButton_28 = new JRadioButton("answer_83");
		buttonGroup_7.add(rdbtnNewRadioButton_28);
		
		JRadioButton rdbtnNewRadioButton_29 = new JRadioButton("answer_84");
		buttonGroup_7.add(rdbtnNewRadioButton_29);
		
		JLabel lblQuestion_8 = new JLabel("Question_9");
		
		JRadioButton rdbtnNewRadioButton_30 = new JRadioButton("answer_91");
		buttonGroup_8.add(rdbtnNewRadioButton_30);
		
		JRadioButton rdbtnNewRadioButton_31 = new JRadioButton("answer_92");
		buttonGroup_8.add(rdbtnNewRadioButton_31);
		
		JRadioButton rdbtnNewRadioButton_32 = new JRadioButton("answer_93");
		buttonGroup_8.add(rdbtnNewRadioButton_32);
		
		JRadioButton rdbtnNewRadioButton_33 = new JRadioButton("answer_94");
		buttonGroup_8.add(rdbtnNewRadioButton_33);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblQuestion_6)
						.addComponent(rdbtnNewRadioButton_22)
						.addComponent(rdbtnNewRadioButton_23)
						.addComponent(rdbtnNewRadioButton_24)
						.addComponent(rdbtnNewRadioButton_25))
					.addGap(358)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblQuestion_7)
						.addComponent(rdbtnNewRadioButton_26)
						.addComponent(rdbtnNewRadioButton_27)
						.addComponent(rdbtnNewRadioButton_28)
						.addComponent(rdbtnNewRadioButton_29))
					.addGap(292)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_33)
						.addComponent(rdbtnNewRadioButton_32)
						.addComponent(rdbtnNewRadioButton_31)
						.addComponent(rdbtnNewRadioButton_30)
						.addComponent(lblQuestion_8))
					.addContainerGap(327, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuestion_6)
						.addComponent(lblQuestion_7)
						.addComponent(lblQuestion_8))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_22)
						.addComponent(rdbtnNewRadioButton_26)
						.addComponent(rdbtnNewRadioButton_30))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_23)
						.addComponent(rdbtnNewRadioButton_27)
						.addComponent(rdbtnNewRadioButton_31))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_24)
						.addComponent(rdbtnNewRadioButton_28)
						.addComponent(rdbtnNewRadioButton_32))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_25)
						.addComponent(rdbtnNewRadioButton_29)
						.addComponent(rdbtnNewRadioButton_33))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblQuestion_3 = new JLabel("Question_4");
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("answer_41");
		buttonGroup_3.add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("answer_42");
		buttonGroup_3.add(rdbtnNewRadioButton_11);
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("answer_43");
		buttonGroup_3.add(rdbtnNewRadioButton_12);
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("answer_44");
		buttonGroup_3.add(rdbtnNewRadioButton_13);
		
		JLabel lblQuestion_4 = new JLabel("Question_5");
		
		JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("answer_51");
		buttonGroup_4.add(rdbtnNewRadioButton_14);
		
		JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("answer_52");
		buttonGroup_4.add(rdbtnNewRadioButton_15);
		
		JRadioButton rdbtnNewRadioButton_16 = new JRadioButton("answer_53");
		buttonGroup_4.add(rdbtnNewRadioButton_16);
		
		JRadioButton rdbtnNewRadioButton_17 = new JRadioButton("answer_54");
		buttonGroup_4.add(rdbtnNewRadioButton_17);
		
		JLabel lblQuestion_5 = new JLabel("Question_6");
		
		JRadioButton rdbtnNewRadioButton_18 = new JRadioButton("answer_61");
		buttonGroup_5.add(rdbtnNewRadioButton_18);
		
		JRadioButton rdbtnNewRadioButton_19 = new JRadioButton("answer_62");
		buttonGroup_5.add(rdbtnNewRadioButton_19);
		
		JRadioButton rdbtnNewRadioButton_20 = new JRadioButton("answer_63");
		buttonGroup_5.add(rdbtnNewRadioButton_20);
		
		JRadioButton rdbtnNewRadioButton_21 = new JRadioButton("answer_64");
		buttonGroup_5.add(rdbtnNewRadioButton_21);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblQuestion_3)
						.addComponent(rdbtnNewRadioButton_10)
						.addComponent(rdbtnNewRadioButton_11)
						.addComponent(rdbtnNewRadioButton_12)
						.addComponent(rdbtnNewRadioButton_13))
					.addGap(357)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblQuestion_4)
						.addComponent(rdbtnNewRadioButton_14)
						.addComponent(rdbtnNewRadioButton_15)
						.addComponent(rdbtnNewRadioButton_16)
						.addComponent(rdbtnNewRadioButton_17))
					.addGap(290)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_21)
						.addComponent(rdbtnNewRadioButton_20)
						.addComponent(rdbtnNewRadioButton_19)
						.addComponent(rdbtnNewRadioButton_18)
						.addComponent(lblQuestion_5))
					.addContainerGap(330, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuestion_3)
						.addComponent(lblQuestion_4)
						.addComponent(lblQuestion_5))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_10)
						.addComponent(rdbtnNewRadioButton_14)
						.addComponent(rdbtnNewRadioButton_18))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_11)
						.addComponent(rdbtnNewRadioButton_15)
						.addComponent(rdbtnNewRadioButton_19))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_12)
						.addComponent(rdbtnNewRadioButton_16)
						.addComponent(rdbtnNewRadioButton_20))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_13)
						.addComponent(rdbtnNewRadioButton_17)
						.addComponent(rdbtnNewRadioButton_21))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblQuestion = new JLabel("Question_1");
		
		JRadioButton rdbtnAnswer = new JRadioButton("answer_11");
		buttonGroup.add(rdbtnAnswer);
		
		JRadioButton rdbtnAnswer_1 = new JRadioButton("answer_12");
		buttonGroup.add(rdbtnAnswer_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("answer_13");
		buttonGroup.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("answer_14");
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		JLabel lblQuestion_1 = new JLabel("Question_2");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("answer_21");
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("answer_22");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("answer_23");
		buttonGroup_1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("answer_24");
		buttonGroup_1.add(rdbtnNewRadioButton_5);
		
		JLabel lblQuestion_2 = new JLabel("Question_3");
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("answer_31");
		buttonGroup_2.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("answer_32");
		buttonGroup_2.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("answer_33");
		buttonGroup_2.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("answer_34");
		buttonGroup_2.add(rdbtnNewRadioButton_9);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblQuestion)
						.addComponent(rdbtnAnswer)
						.addComponent(rdbtnAnswer_1)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_1))
					.addGap(354)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblQuestion_1)
						.addComponent(rdbtnNewRadioButton_2)
						.addComponent(rdbtnNewRadioButton_3)
						.addComponent(rdbtnNewRadioButton_4)
						.addComponent(rdbtnNewRadioButton_5))
					.addGap(294)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_9)
						.addComponent(rdbtnNewRadioButton_8)
						.addComponent(rdbtnNewRadioButton_7)
						.addComponent(rdbtnNewRadioButton_6)
						.addComponent(lblQuestion_2))
					.addContainerGap(329, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuestion)
						.addComponent(lblQuestion_1)
						.addComponent(lblQuestion_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnAnswer)
						.addComponent(rdbtnNewRadioButton_2)
						.addComponent(rdbtnNewRadioButton_6))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnAnswer_1)
						.addComponent(rdbtnNewRadioButton_3)
						.addComponent(rdbtnNewRadioButton_7))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_4)
						.addComponent(rdbtnNewRadioButton_8))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(rdbtnNewRadioButton_5)
						.addComponent(rdbtnNewRadioButton_9))
					.addContainerGap(79, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
