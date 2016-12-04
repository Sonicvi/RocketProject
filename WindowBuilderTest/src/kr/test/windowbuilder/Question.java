package kr.test.windowbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Question {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private CardLayout cardLayout = new CardLayout();

	private int qCount = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question window = new Question();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 
	 * Getter and setter for qCount
	 */

	public int getqCount() {
		return qCount;
	}

	public void setqCount(int qCount) {
		this.qCount = qCount;
	}

	/**
	 * Create the application.
	 */
	public Question() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(cardLayout);

		// CardLayout cl = (CardLayout)(frame.getContentPane().getLayout());

		// create new quiz object
		Quiz q = new Quiz();
		// when moving to next question increase counter by 1 and when going
		// back decrease counter by 1
		JPanel panel_0 = new JPanel();
		frame.getContentPane().add(panel_0, "cardPanel");
		panel_0.setLayout(new CardLayout(0, 0));

		JPanel panel = new JPanel();
		panel_0.add(panel, "Q1");

		JPanel panel_1 = new JPanel();
		panel_0.add(panel_1, "Q2");

		JPanel panel_2 = new JPanel();
		panel_0.add(panel_2, "Q3");

		JPanel panel_3 = new JPanel();
		panel_0.add(panel_3, "Q4");

		JPanel panel_4 = new JPanel();
		panel_0.add(panel_4, "Q5");

		// CardLayout cl = (CardLayout)(frame.getLayout());
		// cardLayout.first(panel);

		JLabel label = new JLabel("Q" + (qCount + 1) + " " + q.qpa[qCount][0]);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel labelPic = new JLabel("");
		labelPic.setIcon(new ImageIcon("C:\\Users\\Riku\\Desktop\\6e18d91076204287c227ce03e273c701_original.jpg"));

		JRadioButton rdbtnAns1 = new JRadioButton(q.qpa[qCount][1]);
		rdbtnAns1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonGroup.add(rdbtnAns1);

		JRadioButton rdbtnAns2 = new JRadioButton(q.qpa[0][2]);
		rdbtnAns2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonGroup.add(rdbtnAns2);

		JRadioButton rdbtnAns3 = new JRadioButton(q.qpa[qCount][3]);
		rdbtnAns3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonGroup.add(rdbtnAns3);

		JRadioButton rdbtnAns4 = new JRadioButton(q.qpa[qCount][4]);
		rdbtnAns4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonGroup.add(rdbtnAns4);

		JButton btnPrev = new JButton("Previous");
		btnPrev.setEnabled(false);
		// btnPrev.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent arg0) {
		//
		// }
		// });
		btnPrev.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setqCount(2);
				CardLayout cardLayout = (CardLayout) (panel_0.getLayout());
				cardLayout.show(panel_0, "Q2");

			}
		});
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton btnMMenu = new JButton("Main Menu");
		btnMMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMMenu.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel label_2 = new JLabel((qCount + 1) + "/5");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING, gl_panel
						.createSequentialGroup().addGap(294)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(
										gl_panel.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED,
												128, GroupLayout.PREFERRED_SIZE).addComponent(label,
														GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.LEADING,
										gl_panel.createParallelGroup(Alignment.LEADING, false)
												.addGroup(Alignment.TRAILING,
														gl_panel.createSequentialGroup()
																.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 103,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(btnPrev, GroupLayout.PREFERRED_SIZE, 113,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(54)
																.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 113,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(59).addComponent(btnMMenu,
																		GroupLayout.PREFERRED_SIZE, 122,
																		GroupLayout.PREFERRED_SIZE))
												.addComponent(labelPic, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE,
														671, GroupLayout.PREFERRED_SIZE)
												.addComponent(rdbtnAns4).addComponent(rdbtnAns3).addComponent(rdbtnAns2)
												.addComponent(rdbtnAns1)))
						.addContainerGap(293, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addGap(27)
				.addComponent(label, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(labelPic, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE).addGap(12)
				.addComponent(rdbtnAns1).addPreferredGap(ComponentPlacement.RELATED).addComponent(rdbtnAns2)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(rdbtnAns3)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(rdbtnAns4)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnPrev, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE).addComponent(
										label_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup().addGap(2).addComponent(btnNext,
								GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup().addGap(2).addComponent(btnMMenu,
								GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
				.addGap(27)));
		panel.setLayout(gl_panel);

		setqCount(2);

		JLabel label_1 = new JLabel("Q" + (getqCount()) + " " + q.qpa[getqCount()][0]);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel label_3 = new JLabel(getqCount() + "/5");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JButton button = new JButton("Previous");
		button.setEnabled(true);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPrev.setEnabled(false);
				setqCount(getqCount() - 1);
				CardLayout cardLayout = (CardLayout) (panel_0.getLayout());
				cardLayout.show(panel_0, "Q1");

			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton button_1 = new JButton("Next");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setqCount((getqCount() + 1));
				CardLayout cardLayout = (CardLayout) (panel_0.getLayout());
				cardLayout.show(panel_0, "Q3");

			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton button_2 = new JButton("Main Menu");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\Riku\\Desktop\\6e18d91076204287c227ce03e273c701_original.jpg"));

		JRadioButton radioButton = new JRadioButton(q.qpa[getqCount()][1]);
		buttonGroup.add(radioButton);
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JRadioButton radioButton_1 = new JRadioButton(q.qpa[getqCount()][2]);
		buttonGroup.add(radioButton_1);
		radioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JRadioButton radioButton_2 = new JRadioButton(q.qpa[getqCount()][3]);
		buttonGroup.add(radioButton_2);
		radioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JRadioButton radioButton_3 = new JRadioButton(q.qpa[getqCount()][4]);
		buttonGroup.add(radioButton_3);
		radioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1
				.createSequentialGroup().addGap(294)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup().addGap(128).addComponent(label_1,
								GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 671, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
								.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addGap(107)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addGap(54)
								.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addGap(59)
								.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(radioButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(radioButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(radioButton_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(radioButton_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 249,
										Short.MAX_VALUE)))
				.addContainerGap(293, Short.MAX_VALUE)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addGap(27)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE).addGap(9)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE).addGap(12)
						.addComponent(radioButton_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(radioButton_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(radioButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_1
								.createParallelGroup(Alignment.LEADING)
								.addGroup(
										gl_panel_1.createSequentialGroup().addGap(4).addComponent(label_3,
												GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup().addGap(2).addComponent(button_1,
										GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup().addGap(2).addComponent(button_2,
										GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(27, Short.MAX_VALUE)));
		panel_1.setLayout(gl_panel_1);

		setqCount(3);

		JLabel label_5 = new JLabel("Q" + (getqCount()) + " " + q.qpa[getqCount()][0]);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel label_6 = new JLabel("");

		JRadioButton radioButton_4 = new JRadioButton(q.qpa[qCount][1]);
		buttonGroup.add(radioButton_4);
		radioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JRadioButton radioButton_5 = new JRadioButton(q.qpa[qCount][2]);
		buttonGroup.add(radioButton_5);
		radioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JRadioButton radioButton_6 = new JRadioButton(q.qpa[qCount][3]);
		buttonGroup.add(radioButton_6);
		radioButton_6.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JRadioButton radioButton_7 = new JRadioButton(q.qpa[qCount][4]);
		buttonGroup.add(radioButton_7);
		radioButton_7.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel label_7 = new JLabel(getqCount() + "/5");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JButton button_3 = new JButton("Previous");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setqCount(getqCount() - 1);
				CardLayout cardLayout = (CardLayout) (panel_0.getLayout());
				cardLayout.show(panel_0, "Q2");

			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton button_4 = new JButton("Next");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setqCount((getqCount() + 1));
				CardLayout cardLayout = (CardLayout) (panel_0.getLayout());
				cardLayout.show(panel_0, "Q4");

			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton button_5 = new JButton("Main Menu");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2
				.createSequentialGroup().addGap(294)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup().addGap(128).addComponent(label_5,
								GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 671, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createSequentialGroup()
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addGap(107)
								.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addGap(54)
								.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addGap(59)
								.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(radioButton_7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(radioButton_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(radioButton_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(radioButton_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 234,
										Short.MAX_VALUE)))
				.addContainerGap(293, Short.MAX_VALUE)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup().addGap(27)
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE).addGap(9)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE).addGap(12)
						.addComponent(radioButton_4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(radioButton_5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(radioButton_6, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(radioButton_7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_2
								.createParallelGroup(Alignment.LEADING)
								.addGroup(
										gl_panel_2.createSequentialGroup().addGap(4).addComponent(label_7,
												GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2.createSequentialGroup().addGap(2).addComponent(button_4,
										GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup().addGap(2).addComponent(button_5,
										GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(27, Short.MAX_VALUE)));
		panel_2.setLayout(gl_panel_2);

		setqCount(4);

		JLabel label_8 = new JLabel("Q" + (getqCount()) + " " + q.qpa[getqCount()][0]);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel label_9 = new JLabel("");

		JRadioButton radioButton_8 = new JRadioButton(q.qpa[qCount][1]);
		buttonGroup.add(radioButton_8);
		radioButton_8.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JRadioButton radioButton_9 = new JRadioButton(q.qpa[qCount][1]);
		buttonGroup.add(radioButton_9);
		radioButton_9.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JRadioButton radioButton_10 = new JRadioButton(q.qpa[qCount][1]);
		buttonGroup.add(radioButton_10);
		radioButton_10.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JRadioButton radioButton_11 = new JRadioButton(q.qpa[qCount][1]);
		buttonGroup.add(radioButton_11);
		radioButton_11.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel label_10 = new JLabel(getqCount() + "/5");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JButton button_6 = new JButton("Previous");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setqCount(getqCount() - 1);
				CardLayout cardLayout = (CardLayout) (panel_0.getLayout());
				cardLayout.show(panel_0, "Q3");

			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton button_7 = new JButton("Next");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setqCount((getqCount() + 1));
				CardLayout cardLayout = (CardLayout) (panel_0.getLayout());
				cardLayout.show(panel_0, "Q5");

			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton button_8 = new JButton("Main Menu");
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_3
				.createSequentialGroup().addGap(294)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup().addGap(128).addComponent(label_8,
								GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 671, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_3.createSequentialGroup()
								.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addGap(107)
								.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addGap(54)
								.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addGap(59)
								.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(radioButton_11, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(radioButton_10, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(radioButton_9, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(radioButton_8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 240,
										Short.MAX_VALUE)))
				.addContainerGap(293, Short.MAX_VALUE)));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup().addGap(27)
						.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE).addGap(9)
						.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE).addGap(12)
						.addComponent(radioButton_8, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(radioButton_9, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(radioButton_10, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(radioButton_11, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createSequentialGroup().addGap(4).addComponent(label_10,
										GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_3.createSequentialGroup().addGap(2).addComponent(button_7,
										GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_3.createSequentialGroup().addGap(2).addComponent(button_8,
										GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(27, Short.MAX_VALUE)));
		panel_3.setLayout(gl_panel_3);

		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4
				.setHorizontalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING).addGap(0, 1258, Short.MAX_VALUE));
		gl_panel_4.setVerticalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING).addGap(0, 664, Short.MAX_VALUE));
		panel_4.setLayout(gl_panel_4);

	}
}
