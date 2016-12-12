package kr.test.windowbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Question {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private CardLayout cardLayout = new CardLayout();

	private static int qCount = 0;
	private int[] answerArray = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

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

	public static int getqCount() {
		return qCount;
	}

	public static void setqCount(int qCount) {
		Question.qCount = qCount;
	}

	public int[] getAnswerArray() {
		return answerArray;
	}

	public void setAnswerArray(int[] answerArray) {
		answerArray = answerArray;
	}

	/**
	 * Create the application.
	 */
	public Question() {
		initialize();
	}

	public Question(int part) {
		setqCount((part - 1) * 5);
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
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "cardPanel");
		panel.setLayout(new CardLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "Q1");

		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "Q2");

		JPanel panel_3 = new JPanel();
		panel.add(panel_3, "Q3");

		JPanel panel_4 = new JPanel();
		panel.add(panel_4, "Q4");

		// First question
		JLabel Q1label = new JLabel("Q" + ((getqCount() + 1)) + " " + q.qpa[getqCount()][0]);
		Q1label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JLabel counter1 = new JLabel((getqCount() + 1) + "/5");
		counter1.setHorizontalAlignment(SwingConstants.CENTER);
		counter1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		// Second question
		JLabel Q2label = new JLabel("");
		JLabel counter2 = new JLabel("");
		JRadioButton Q2rdbtnAns1 = new JRadioButton("");
		JRadioButton Q2rdbtnAns2 = new JRadioButton("");
		JRadioButton Q2rdbtnAns3 = new JRadioButton("");
		JRadioButton Q2rdbtnAns4 = new JRadioButton("");

		// Third question
		JLabel Q3label = new JLabel("");
		JLabel counter3 = new JLabel("");
		JRadioButton Q3rdbtnAns1 = new JRadioButton("");
		JRadioButton Q3rdbtnAns2 = new JRadioButton("");
		JRadioButton Q3rdbtnAns3 = new JRadioButton("");
		JRadioButton Q3rdbtnAns4 = new JRadioButton("");

		// Fourth question
		JLabel Q4label = new JLabel("");
		JLabel counter4 = new JLabel("");
		JRadioButton Q4rdbtnAns1 = new JRadioButton("");
		JRadioButton Q4rdbtnAns2 = new JRadioButton("");
		JRadioButton Q4rdbtnAns3 = new JRadioButton("");
		JRadioButton Q4rdbtnAns4 = new JRadioButton("");

		//actionlistener for the radiobuttons
		class RadioButtonActionListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent event) {
				JRadioButton button = (JRadioButton) event.getSource();
				//checks if the correct radio button was pressed
				if (button.isSelected() && button.getText() == q.qca[qCount][1]) {
					System.out.println("Correct!");
					answerArray[qCount] = 1;
					// Loic add score++ here!
				} else
					answerArray[qCount] = -1;

				System.out.println("question:" + answerArray[qCount]);
			}
		}

		JLabel labelPic = new JLabel("");
		labelPic.setIcon(null);

		JRadioButton Q1rdbtnAns1 = new JRadioButton(q.qpa[getqCount()][1]);
		Q1rdbtnAns1.addActionListener(new RadioButtonActionListener() {
		});
		Q1rdbtnAns1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonGroup.add(Q1rdbtnAns1);

		JRadioButton Q1rdbtnAns2 = new JRadioButton(q.qpa[qCount][2]);
		Q1rdbtnAns2.addActionListener(new RadioButtonActionListener() {
		});
		Q1rdbtnAns2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonGroup.add(Q1rdbtnAns2);

		JRadioButton Q1rdbtnAns3 = new JRadioButton(q.qpa[qCount][3]);
		Q1rdbtnAns3.addActionListener(new RadioButtonActionListener() {
		});
		Q1rdbtnAns3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonGroup.add(Q1rdbtnAns3);

		JRadioButton Q1rdbtnAns4 = new JRadioButton(q.qpa[qCount][4]);
		Q1rdbtnAns4.addActionListener(new RadioButtonActionListener() {
		});
		Q1rdbtnAns4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonGroup.add(Q1rdbtnAns4);
		//the first previous button is disabled
		JButton btnPrev = new JButton("Previous");
		btnPrev.setEnabled(false);
		btnPrev.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//increase qCount by 1
				qCount++;
				//set the next questions lable, counter and radio buttons
				Q2label.setText("Q" + (getqCount() + 1) + " " + q.qpa[qCount][0]);
				Q2label.setFont(new Font("Tahoma", Font.PLAIN, 20));

				counter2.setText((getqCount() + 1) + "/5");
				counter2.setHorizontalAlignment(SwingConstants.CENTER);
				counter2.setFont(new Font("Tahoma", Font.PLAIN, 20));

				Q2rdbtnAns1.setText(q.qpa[getqCount()][1]);
				Q2rdbtnAns1.addActionListener(new RadioButtonActionListener() {
				});
				buttonGroup.add(Q2rdbtnAns1);
				Q2rdbtnAns1.setFont(new Font("Tahoma", Font.PLAIN, 18));

				Q2rdbtnAns2.setText(q.qpa[getqCount()][2]);
				Q2rdbtnAns2.addActionListener(new RadioButtonActionListener() {
				});
				buttonGroup.add(Q2rdbtnAns2);
				Q2rdbtnAns2.setFont(new Font("Tahoma", Font.PLAIN, 18));

				Q2rdbtnAns3.setText(q.qpa[getqCount()][3]);
				Q2rdbtnAns3.addActionListener(new RadioButtonActionListener() {
				});
				buttonGroup.add(Q2rdbtnAns3);
				Q2rdbtnAns3.setFont(new Font("Tahoma", Font.PLAIN, 18));

				Q2rdbtnAns4.setText(q.qpa[getqCount()][4]);
				Q2rdbtnAns4.addActionListener(new RadioButtonActionListener() {
				});
				buttonGroup.add(Q2rdbtnAns4);
				Q2rdbtnAns4.setFont(new Font("Tahoma", Font.PLAIN, 18));
				//load next panel using cardlayout
				CardLayout cardLayout = (CardLayout) (panel.getLayout());
				cardLayout.show(panel, "Q2");

			}
		});
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 18));

		//Loic add goto main menu function here!
		JButton btnMMenu = new JButton("Main Menu");
		btnMMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMMenu.setFont(new Font("Tahoma", Font.PLAIN, 18));

		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
				gl_panel_1.createSequentialGroup().addGap(294).addGroup(gl_panel_1
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED, 128,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(Q1label, GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
										.addComponent(counter1, GroupLayout.PREFERRED_SIZE, 103,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(btnPrev, GroupLayout.PREFERRED_SIZE, 113,
												GroupLayout.PREFERRED_SIZE)
										.addGap(54)
										.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 113,
												GroupLayout.PREFERRED_SIZE)
										.addGap(59).addComponent(btnMMenu, GroupLayout.PREFERRED_SIZE, 122,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(labelPic, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 671,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(Q1rdbtnAns4).addComponent(Q1rdbtnAns3).addComponent(Q1rdbtnAns2)
								.addComponent(Q1rdbtnAns1)))
						.addContainerGap(293, Short.MAX_VALUE)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1
				.createSequentialGroup().addGap(27)
				.addComponent(Q1label, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(labelPic, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE).addGap(12)
				.addComponent(Q1rdbtnAns1).addPreferredGap(ComponentPlacement.RELATED).addComponent(Q1rdbtnAns2)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(Q1rdbtnAns3)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(Q1rdbtnAns4)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnPrev, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
								.addComponent(counter1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup().addGap(2).addComponent(btnNext,
								GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup().addGap(2).addComponent(btnMMenu,
								GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
				.addGap(27)));
		panel_1.setLayout(gl_panel_1);

		JButton button = new JButton("Previous");
		button.setEnabled(true);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPrev.setEnabled(false);
				//decrease qCount by 1
				qCount--;
				//load the previous panel using cardlayout
				CardLayout cardLayout = (CardLayout) (panel.getLayout());
				cardLayout.show(panel, "Q1");

			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton button_1 = new JButton("Next");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//increase qCount by 1
				qCount++;
				//set the next questions lable, counter and radio buttons
				Q3label.setText("Q" + (getqCount() + 1) + " " + q.qpa[getqCount()][0]);
				Q3label.setFont(new Font("Tahoma", Font.PLAIN, 20));
				counter3.setText((getqCount() + 1) + "/5");

				counter3.setHorizontalAlignment(SwingConstants.CENTER);
				counter3.setFont(new Font("Tahoma", Font.PLAIN, 20));

				Q3rdbtnAns1.setText(q.qpa[getqCount()][1]);
				Q3rdbtnAns1.addActionListener(new RadioButtonActionListener() {
				});
				buttonGroup.add(Q3rdbtnAns1);
				Q3rdbtnAns1.setFont(new Font("Tahoma", Font.PLAIN, 18));

				Q3rdbtnAns2.setText(q.qpa[getqCount()][2]);
				Q3rdbtnAns2.addActionListener(new RadioButtonActionListener() {
				});
				buttonGroup.add(Q3rdbtnAns2);
				Q3rdbtnAns2.setFont(new Font("Tahoma", Font.PLAIN, 18));

				Q3rdbtnAns3.setText(q.qpa[getqCount()][3]);
				Q3rdbtnAns3.addActionListener(new RadioButtonActionListener() {
				});
				buttonGroup.add(Q3rdbtnAns3);
				Q3rdbtnAns3.setFont(new Font("Tahoma", Font.PLAIN, 18));

				Q3rdbtnAns4.setText(q.qpa[getqCount()][4]);
				Q3rdbtnAns4.addActionListener(new RadioButtonActionListener() {
				});
				buttonGroup.add(Q3rdbtnAns4);
				Q3rdbtnAns4.setFont(new Font("Tahoma", Font.PLAIN, 18));

				//load next panel using cardlayout
				CardLayout cardLayout = (CardLayout) (panel.getLayout());
				cardLayout.show(panel, "Q3");

			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		//Loic add goto main menu function here!
		JButton button_2 = new JButton("Main Menu");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel label_4 = new JLabel("");
		label_4.setIcon(null);

		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2
				.createSequentialGroup().addGap(294)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup().addGap(128).addComponent(Q2label,
								GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 671, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createSequentialGroup()
								.addComponent(counter2, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addGap(107)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addGap(54)
								.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addGap(59)
								.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(Q2rdbtnAns4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Q2rdbtnAns3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Q2rdbtnAns2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Q2rdbtnAns1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 249,
										Short.MAX_VALUE)))
				.addContainerGap(293, Short.MAX_VALUE)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup().addGap(27)
						.addComponent(Q2label, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE).addGap(9)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE).addGap(12)
						.addComponent(Q2rdbtnAns1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(Q2rdbtnAns2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(Q2rdbtnAns3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(Q2rdbtnAns4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_2
								.createParallelGroup(Alignment.LEADING)
								.addGroup(
										gl_panel_2.createSequentialGroup().addGap(4).addComponent(counter2,
												GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2.createSequentialGroup().addGap(2).addComponent(button_1,
										GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup().addGap(2).addComponent(button_2,
										GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(27, Short.MAX_VALUE)));
		panel_2.setLayout(gl_panel_2);


		JLabel label_6 = new JLabel("");

		JButton button_3 = new JButton("Previous");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//decrease qCount by 1
				qCount--;
				//load the previous panel using cardlayout
				CardLayout cardLayout = (CardLayout) (panel.getLayout());
				cardLayout.show(panel, "Q2");

				System.out.println("qcount: " + getqCount());

			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton button_4 = new JButton("Next");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//increase qCount by 1
				qCount++;
				//set the next questions lable, counter and radio buttons
				Q4label.setText("Q" + (getqCount() + 1) + " " + q.qpa[getqCount()][0]);
				Q4label.setFont(new Font("Tahoma", Font.PLAIN, 20));

				counter4.setText((getqCount() + 1) + "/5");
				counter4.setHorizontalAlignment(SwingConstants.CENTER);
				counter4.setFont(new Font("Tahoma", Font.PLAIN, 20));

				Q4rdbtnAns1.setText(q.qpa[getqCount()][1]);
				Q4rdbtnAns1.addActionListener(new RadioButtonActionListener() {
				});
				buttonGroup.add(Q4rdbtnAns1);
				Q4rdbtnAns1.setFont(new Font("Tahoma", Font.PLAIN, 18));

				Q4rdbtnAns2.setText(q.qpa[getqCount()][2]);
				Q4rdbtnAns2.addActionListener(new RadioButtonActionListener() {
				});
				buttonGroup.add(Q4rdbtnAns2);
				Q4rdbtnAns2.setFont(new Font("Tahoma", Font.PLAIN, 18));

				Q4rdbtnAns3.setText(q.qpa[getqCount()][3]);
				Q4rdbtnAns3.addActionListener(new RadioButtonActionListener() {
				});
				buttonGroup.add(Q4rdbtnAns3);
				Q4rdbtnAns3.setFont(new Font("Tahoma", Font.PLAIN, 18));

				Q4rdbtnAns4.setText(q.qpa[getqCount()][4]);
				Q4rdbtnAns4.addActionListener(new RadioButtonActionListener() {
				});
				buttonGroup.add(Q4rdbtnAns4);
				Q4rdbtnAns4.setFont(new Font("Tahoma", Font.PLAIN, 18));
				
				//load next panel using cardlayout
				CardLayout cardLayout = (CardLayout) (panel.getLayout());
				cardLayout.show(panel, "Q4");
				System.out.println("qcount: " + getqCount());

			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		//Loic add goto main menu function here!
		JButton button_5 = new JButton("Main Menu");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_3
				.createSequentialGroup().addGap(294)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup().addGap(128).addComponent(Q3label,
								GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 671, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_3.createSequentialGroup()
								.addComponent(counter3, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addGap(107)
								.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addGap(54)
								.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addGap(59)
								.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(Q3rdbtnAns4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Q3rdbtnAns3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Q3rdbtnAns2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Q3rdbtnAns1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 234,
										Short.MAX_VALUE)))
				.addContainerGap(293, Short.MAX_VALUE)));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup().addGap(27)
						.addComponent(Q3label, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE).addGap(9)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE).addGap(12)
						.addComponent(Q3rdbtnAns1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(Q3rdbtnAns2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(Q3rdbtnAns3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(Q3rdbtnAns4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_3
								.createParallelGroup(Alignment.LEADING)
								.addGroup(
										gl_panel_3.createSequentialGroup().addGap(4).addComponent(counter3,
												GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_3.createSequentialGroup().addGap(2).addComponent(button_4,
										GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_3.createSequentialGroup().addGap(2).addComponent(button_5,
										GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(27, Short.MAX_VALUE)));
		panel_3.setLayout(gl_panel_3);


		JLabel label_9 = new JLabel("");

		JButton button_6 = new JButton("Previous");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//decrease qCount by 1
				qCount--;
				//load the previous panel using cardlayout
				CardLayout cardLayout = (CardLayout) (panel.getLayout());
				cardLayout.show(panel, "Q3");
				System.out.println("qcount: " + getqCount());

			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JButton button_7 = new JButton("Next");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				setqCount((getqCount() + 1));
//				CardLayout cardLayout = (CardLayout) (panel.getLayout());
//				cardLayout.show(panel, "Q5");

			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 18));

		//Loic add goto main menu function here!
		JButton button_8 = new JButton("Main Menu");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_4
				.createSequentialGroup().addGap(294)
				.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup().addGap(128).addComponent(Q4label,
								GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 671, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_4.createSequentialGroup()
								.addComponent(counter4, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addGap(107)
								.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addGap(54)
								.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addGap(59)
								.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(Q4rdbtnAns4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Q4rdbtnAns3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Q4rdbtnAns2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Q4rdbtnAns1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 240,
										Short.MAX_VALUE)))
				.addContainerGap(293, Short.MAX_VALUE)));
		gl_panel_4.setVerticalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup().addGap(27)
						.addComponent(Q4label, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE).addGap(9)
						.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE).addGap(12)
						.addComponent(Q4rdbtnAns1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(Q4rdbtnAns2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(Q4rdbtnAns3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(Q4rdbtnAns4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_4
								.createParallelGroup(Alignment.LEADING)
								.addGroup(
										gl_panel_4.createSequentialGroup().addGap(4).addComponent(counter4,
												GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_4.createSequentialGroup().addGap(2).addComponent(button_7,
										GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_4.createSequentialGroup().addGap(2).addComponent(button_8,
										GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(27, Short.MAX_VALUE)));
		panel_4.setLayout(gl_panel_4);
		System.out.println("initialized qcount:" + getqCount());
	}
}
