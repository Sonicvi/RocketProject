package kr.test.windowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Result extends JFrame {

	private JPanel contentPane;

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
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblResult = new JLabel("Result");
		GridBagConstraints gbc_lblResult = new GridBagConstraints();
		gbc_lblResult.insets = new Insets(0, 0, 5, 5);
		gbc_lblResult.gridx = 0;
		gbc_lblResult.gridy = 0;
		contentPane.add(lblResult, gbc_lblResult);
		
		JLabel lblScore = new JLabel("Score");
		GridBagConstraints gbc_lblScore = new GridBagConstraints();
		gbc_lblScore.insets = new Insets(0, 0, 5, 5);
		gbc_lblScore.gridx = 6;
		gbc_lblScore.gridy = 0;
		contentPane.add(lblScore, gbc_lblScore);
		
		JLabel lblQ = new JLabel("Q1");
		GridBagConstraints gbc_lblQ = new GridBagConstraints();
		gbc_lblQ.insets = new Insets(0, 0, 5, 5);
		gbc_lblQ.gridx = 0;
		gbc_lblQ.gridy = 2;
		contentPane.add(lblQ, gbc_lblQ);
		
		JLabel lblQ_1 = new JLabel("Q2");
		GridBagConstraints gbc_lblQ_1 = new GridBagConstraints();
		gbc_lblQ_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblQ_1.gridx = 13;
		gbc_lblQ_1.gridy = 2;
		contentPane.add(lblQ_1, gbc_lblQ_1);
		
		JLabel lblQ_2 = new JLabel("Q3");
		GridBagConstraints gbc_lblQ_2 = new GridBagConstraints();
		gbc_lblQ_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblQ_2.gridx = 26;
		gbc_lblQ_2.gridy = 2;
		contentPane.add(lblQ_2, gbc_lblQ_2);
		
		JRadioButton rdbtnA = new JRadioButton("a");
		GridBagConstraints gbc_rdbtnA = new GridBagConstraints();
		gbc_rdbtnA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnA.gridx = 0;
		gbc_rdbtnA.gridy = 3;
		contentPane.add(rdbtnA, gbc_rdbtnA);
		
		JRadioButton rdbtnA_1 = new JRadioButton("a");
		GridBagConstraints gbc_rdbtnA_1 = new GridBagConstraints();
		gbc_rdbtnA_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnA_1.gridx = 13;
		gbc_rdbtnA_1.gridy = 3;
		contentPane.add(rdbtnA_1, gbc_rdbtnA_1);
		
		JRadioButton rdbtnA_2 = new JRadioButton("a");
		GridBagConstraints gbc_rdbtnA_2 = new GridBagConstraints();
		gbc_rdbtnA_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnA_2.gridx = 26;
		gbc_rdbtnA_2.gridy = 3;
		contentPane.add(rdbtnA_2, gbc_rdbtnA_2);
		
		JRadioButton rdbtnB = new JRadioButton("b");
		GridBagConstraints gbc_rdbtnB = new GridBagConstraints();
		gbc_rdbtnB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnB.gridx = 0;
		gbc_rdbtnB.gridy = 4;
		contentPane.add(rdbtnB, gbc_rdbtnB);
		
		JRadioButton rdbtnB_1 = new JRadioButton("b");
		GridBagConstraints gbc_rdbtnB_1 = new GridBagConstraints();
		gbc_rdbtnB_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnB_1.gridx = 13;
		gbc_rdbtnB_1.gridy = 4;
		contentPane.add(rdbtnB_1, gbc_rdbtnB_1);
		
		JRadioButton rdbtnB_2 = new JRadioButton("b");
		GridBagConstraints gbc_rdbtnB_2 = new GridBagConstraints();
		gbc_rdbtnB_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnB_2.gridx = 26;
		gbc_rdbtnB_2.gridy = 4;
		contentPane.add(rdbtnB_2, gbc_rdbtnB_2);
		
		JRadioButton rdbtnC = new JRadioButton("c");
		GridBagConstraints gbc_rdbtnC = new GridBagConstraints();
		gbc_rdbtnC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnC.gridx = 0;
		gbc_rdbtnC.gridy = 5;
		contentPane.add(rdbtnC, gbc_rdbtnC);
		
		JRadioButton rdbtnC_1 = new JRadioButton("c");
		GridBagConstraints gbc_rdbtnC_1 = new GridBagConstraints();
		gbc_rdbtnC_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnC_1.gridx = 13;
		gbc_rdbtnC_1.gridy = 5;
		contentPane.add(rdbtnC_1, gbc_rdbtnC_1);
		
		JRadioButton rdbtnC_2 = new JRadioButton("c");
		GridBagConstraints gbc_rdbtnC_2 = new GridBagConstraints();
		gbc_rdbtnC_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnC_2.gridx = 26;
		gbc_rdbtnC_2.gridy = 5;
		contentPane.add(rdbtnC_2, gbc_rdbtnC_2);
		
		JRadioButton rdbtnD = new JRadioButton("d");
		GridBagConstraints gbc_rdbtnD = new GridBagConstraints();
		gbc_rdbtnD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnD.gridx = 0;
		gbc_rdbtnD.gridy = 6;
		contentPane.add(rdbtnD, gbc_rdbtnD);
		
		JRadioButton rdbtnD_1 = new JRadioButton("d");
		GridBagConstraints gbc_rdbtnD_1 = new GridBagConstraints();
		gbc_rdbtnD_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnD_1.gridx = 13;
		gbc_rdbtnD_1.gridy = 6;
		contentPane.add(rdbtnD_1, gbc_rdbtnD_1);
		
		JRadioButton rdbtnD_2 = new JRadioButton("d");
		GridBagConstraints gbc_rdbtnD_2 = new GridBagConstraints();
		gbc_rdbtnD_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnD_2.gridx = 26;
		gbc_rdbtnD_2.gridy = 6;
		contentPane.add(rdbtnD_2, gbc_rdbtnD_2);
		
		JLabel lblQ_3 = new JLabel("Q4");
		GridBagConstraints gbc_lblQ_3 = new GridBagConstraints();
		gbc_lblQ_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblQ_3.gridx = 0;
		gbc_lblQ_3.gridy = 8;
		contentPane.add(lblQ_3, gbc_lblQ_3);
		
		JLabel lblQ_4 = new JLabel("Q5");
		GridBagConstraints gbc_lblQ_4 = new GridBagConstraints();
		gbc_lblQ_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblQ_4.gridx = 13;
		gbc_lblQ_4.gridy = 8;
		contentPane.add(lblQ_4, gbc_lblQ_4);
		
		JLabel lblQ_5 = new JLabel("Q6");
		GridBagConstraints gbc_lblQ_5 = new GridBagConstraints();
		gbc_lblQ_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblQ_5.gridx = 26;
		gbc_lblQ_5.gridy = 8;
		contentPane.add(lblQ_5, gbc_lblQ_5);
		
		JRadioButton rdbtnA_3 = new JRadioButton("a");
		GridBagConstraints gbc_rdbtnA_3 = new GridBagConstraints();
		gbc_rdbtnA_3.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnA_3.gridx = 0;
		gbc_rdbtnA_3.gridy = 9;
		contentPane.add(rdbtnA_3, gbc_rdbtnA_3);
		
		JRadioButton rdbtnA_4 = new JRadioButton("a");
		GridBagConstraints gbc_rdbtnA_4 = new GridBagConstraints();
		gbc_rdbtnA_4.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnA_4.gridx = 13;
		gbc_rdbtnA_4.gridy = 9;
		contentPane.add(rdbtnA_4, gbc_rdbtnA_4);
		
		JRadioButton rdbtnA_5 = new JRadioButton("a");
		GridBagConstraints gbc_rdbtnA_5 = new GridBagConstraints();
		gbc_rdbtnA_5.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnA_5.gridx = 26;
		gbc_rdbtnA_5.gridy = 9;
		contentPane.add(rdbtnA_5, gbc_rdbtnA_5);
		
		JRadioButton rdbtnB_3 = new JRadioButton("b");
		GridBagConstraints gbc_rdbtnB_3 = new GridBagConstraints();
		gbc_rdbtnB_3.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnB_3.gridx = 0;
		gbc_rdbtnB_3.gridy = 10;
		contentPane.add(rdbtnB_3, gbc_rdbtnB_3);
		
		JRadioButton rdbtnB_4 = new JRadioButton("b");
		GridBagConstraints gbc_rdbtnB_4 = new GridBagConstraints();
		gbc_rdbtnB_4.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnB_4.gridx = 13;
		gbc_rdbtnB_4.gridy = 10;
		contentPane.add(rdbtnB_4, gbc_rdbtnB_4);
		
		JRadioButton rdbtnB_5 = new JRadioButton("b");
		GridBagConstraints gbc_rdbtnB_5 = new GridBagConstraints();
		gbc_rdbtnB_5.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnB_5.gridx = 26;
		gbc_rdbtnB_5.gridy = 10;
		contentPane.add(rdbtnB_5, gbc_rdbtnB_5);
		
		JRadioButton rdbtnC_3 = new JRadioButton("c");
		GridBagConstraints gbc_rdbtnC_3 = new GridBagConstraints();
		gbc_rdbtnC_3.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnC_3.gridx = 0;
		gbc_rdbtnC_3.gridy = 11;
		contentPane.add(rdbtnC_3, gbc_rdbtnC_3);
		
		JRadioButton rdbtnC_4 = new JRadioButton("c");
		GridBagConstraints gbc_rdbtnC_4 = new GridBagConstraints();
		gbc_rdbtnC_4.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnC_4.gridx = 13;
		gbc_rdbtnC_4.gridy = 11;
		contentPane.add(rdbtnC_4, gbc_rdbtnC_4);
		
		JRadioButton rdbtnC_5 = new JRadioButton("c");
		GridBagConstraints gbc_rdbtnC_5 = new GridBagConstraints();
		gbc_rdbtnC_5.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnC_5.gridx = 26;
		gbc_rdbtnC_5.gridy = 11;
		contentPane.add(rdbtnC_5, gbc_rdbtnC_5);
		
		JRadioButton rdbtnD_3 = new JRadioButton("d");
		GridBagConstraints gbc_rdbtnD_3 = new GridBagConstraints();
		gbc_rdbtnD_3.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnD_3.gridx = 0;
		gbc_rdbtnD_3.gridy = 12;
		contentPane.add(rdbtnD_3, gbc_rdbtnD_3);
		
		JRadioButton rdbtnD_4 = new JRadioButton("d");
		GridBagConstraints gbc_rdbtnD_4 = new GridBagConstraints();
		gbc_rdbtnD_4.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnD_4.gridx = 13;
		gbc_rdbtnD_4.gridy = 12;
		contentPane.add(rdbtnD_4, gbc_rdbtnD_4);
		
		JRadioButton rdbtnD_5 = new JRadioButton("d");
		GridBagConstraints gbc_rdbtnD_5 = new GridBagConstraints();
		gbc_rdbtnD_5.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnD_5.gridx = 26;
		gbc_rdbtnD_5.gridy = 12;
		contentPane.add(rdbtnD_5, gbc_rdbtnD_5);
		
		JLabel lblQ_6 = new JLabel("Q7");
		GridBagConstraints gbc_lblQ_6 = new GridBagConstraints();
		gbc_lblQ_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblQ_6.gridx = 0;
		gbc_lblQ_6.gridy = 14;
		contentPane.add(lblQ_6, gbc_lblQ_6);
		
		JLabel lblQ_7 = new JLabel("Q8");
		GridBagConstraints gbc_lblQ_7 = new GridBagConstraints();
		gbc_lblQ_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblQ_7.gridx = 13;
		gbc_lblQ_7.gridy = 14;
		contentPane.add(lblQ_7, gbc_lblQ_7);
		
		JLabel lblQ_8 = new JLabel("Q9");
		GridBagConstraints gbc_lblQ_8 = new GridBagConstraints();
		gbc_lblQ_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblQ_8.gridx = 26;
		gbc_lblQ_8.gridy = 14;
		contentPane.add(lblQ_8, gbc_lblQ_8);
		
		JRadioButton rdbtnA_6 = new JRadioButton("a");
		GridBagConstraints gbc_rdbtnA_6 = new GridBagConstraints();
		gbc_rdbtnA_6.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnA_6.gridx = 0;
		gbc_rdbtnA_6.gridy = 15;
		contentPane.add(rdbtnA_6, gbc_rdbtnA_6);
		
		JRadioButton rdbtnA_7 = new JRadioButton("a");
		GridBagConstraints gbc_rdbtnA_7 = new GridBagConstraints();
		gbc_rdbtnA_7.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnA_7.gridx = 13;
		gbc_rdbtnA_7.gridy = 15;
		contentPane.add(rdbtnA_7, gbc_rdbtnA_7);
		
		JRadioButton rdbtnA_8 = new JRadioButton("a");
		GridBagConstraints gbc_rdbtnA_8 = new GridBagConstraints();
		gbc_rdbtnA_8.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnA_8.gridx = 26;
		gbc_rdbtnA_8.gridy = 15;
		contentPane.add(rdbtnA_8, gbc_rdbtnA_8);
		
		JRadioButton rdbtnB_6 = new JRadioButton("b");
		GridBagConstraints gbc_rdbtnB_6 = new GridBagConstraints();
		gbc_rdbtnB_6.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnB_6.gridx = 0;
		gbc_rdbtnB_6.gridy = 16;
		contentPane.add(rdbtnB_6, gbc_rdbtnB_6);
		
		JRadioButton rdbtnB_7 = new JRadioButton("b");
		GridBagConstraints gbc_rdbtnB_7 = new GridBagConstraints();
		gbc_rdbtnB_7.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnB_7.gridx = 13;
		gbc_rdbtnB_7.gridy = 16;
		contentPane.add(rdbtnB_7, gbc_rdbtnB_7);
		
		JRadioButton rdbtnB_8 = new JRadioButton("b");
		GridBagConstraints gbc_rdbtnB_8 = new GridBagConstraints();
		gbc_rdbtnB_8.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnB_8.gridx = 26;
		gbc_rdbtnB_8.gridy = 16;
		contentPane.add(rdbtnB_8, gbc_rdbtnB_8);
		
		JRadioButton rdbtnC_6 = new JRadioButton("c");
		GridBagConstraints gbc_rdbtnC_6 = new GridBagConstraints();
		gbc_rdbtnC_6.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnC_6.gridx = 0;
		gbc_rdbtnC_6.gridy = 17;
		contentPane.add(rdbtnC_6, gbc_rdbtnC_6);
		
		JRadioButton rdbtnC_7 = new JRadioButton("c");
		GridBagConstraints gbc_rdbtnC_7 = new GridBagConstraints();
		gbc_rdbtnC_7.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnC_7.gridx = 13;
		gbc_rdbtnC_7.gridy = 17;
		contentPane.add(rdbtnC_7, gbc_rdbtnC_7);
		
		JRadioButton rdbtnC_8 = new JRadioButton("c");
		GridBagConstraints gbc_rdbtnC_8 = new GridBagConstraints();
		gbc_rdbtnC_8.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnC_8.gridx = 26;
		gbc_rdbtnC_8.gridy = 17;
		contentPane.add(rdbtnC_8, gbc_rdbtnC_8);
		
		JRadioButton rdbtnD_6 = new JRadioButton("d");
		GridBagConstraints gbc_rdbtnD_6 = new GridBagConstraints();
		gbc_rdbtnD_6.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnD_6.gridx = 0;
		gbc_rdbtnD_6.gridy = 18;
		contentPane.add(rdbtnD_6, gbc_rdbtnD_6);
		
		JRadioButton rdbtnD_7 = new JRadioButton("d");
		GridBagConstraints gbc_rdbtnD_7 = new GridBagConstraints();
		gbc_rdbtnD_7.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnD_7.gridx = 13;
		gbc_rdbtnD_7.gridy = 18;
		contentPane.add(rdbtnD_7, gbc_rdbtnD_7);
		
		JRadioButton rdbtnD_8 = new JRadioButton("d");
		GridBagConstraints gbc_rdbtnD_8 = new GridBagConstraints();
		gbc_rdbtnD_8.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnD_8.gridx = 26;
		gbc_rdbtnD_8.gridy = 18;
		contentPane.add(rdbtnD_8, gbc_rdbtnD_8);
		
		JLabel lblQ_9 = new JLabel("Q10");
		GridBagConstraints gbc_lblQ_9 = new GridBagConstraints();
		gbc_lblQ_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblQ_9.gridx = 0;
		gbc_lblQ_9.gridy = 20;
		contentPane.add(lblQ_9, gbc_lblQ_9);
		
		JLabel lblQ_10 = new JLabel("Q11");
		GridBagConstraints gbc_lblQ_10 = new GridBagConstraints();
		gbc_lblQ_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblQ_10.gridx = 13;
		gbc_lblQ_10.gridy = 20;
		contentPane.add(lblQ_10, gbc_lblQ_10);
		
		JLabel lblQ_11 = new JLabel("Q12");
		GridBagConstraints gbc_lblQ_11 = new GridBagConstraints();
		gbc_lblQ_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblQ_11.gridx = 26;
		gbc_lblQ_11.gridy = 20;
		contentPane.add(lblQ_11, gbc_lblQ_11);
		
		JRadioButton rdbtnA_9 = new JRadioButton("a");
		GridBagConstraints gbc_rdbtnA_9 = new GridBagConstraints();
		gbc_rdbtnA_9.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnA_9.gridx = 0;
		gbc_rdbtnA_9.gridy = 21;
		contentPane.add(rdbtnA_9, gbc_rdbtnA_9);
		
		JRadioButton rdbtnA_10 = new JRadioButton("a");
		GridBagConstraints gbc_rdbtnA_10 = new GridBagConstraints();
		gbc_rdbtnA_10.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnA_10.gridx = 13;
		gbc_rdbtnA_10.gridy = 21;
		contentPane.add(rdbtnA_10, gbc_rdbtnA_10);
		
		JRadioButton rdbtnA_11 = new JRadioButton("a");
		GridBagConstraints gbc_rdbtnA_11 = new GridBagConstraints();
		gbc_rdbtnA_11.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnA_11.gridx = 26;
		gbc_rdbtnA_11.gridy = 21;
		contentPane.add(rdbtnA_11, gbc_rdbtnA_11);
		
		JRadioButton rdbtnB_9 = new JRadioButton("b");
		GridBagConstraints gbc_rdbtnB_9 = new GridBagConstraints();
		gbc_rdbtnB_9.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnB_9.gridx = 0;
		gbc_rdbtnB_9.gridy = 22;
		contentPane.add(rdbtnB_9, gbc_rdbtnB_9);
		
		JRadioButton rdbtnB_10 = new JRadioButton("b");
		GridBagConstraints gbc_rdbtnB_10 = new GridBagConstraints();
		gbc_rdbtnB_10.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnB_10.gridx = 13;
		gbc_rdbtnB_10.gridy = 22;
		contentPane.add(rdbtnB_10, gbc_rdbtnB_10);
		
		JRadioButton rdbtnB_11 = new JRadioButton("b");
		GridBagConstraints gbc_rdbtnB_11 = new GridBagConstraints();
		gbc_rdbtnB_11.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnB_11.gridx = 26;
		gbc_rdbtnB_11.gridy = 22;
		contentPane.add(rdbtnB_11, gbc_rdbtnB_11);
		
		JRadioButton rdbtnC_9 = new JRadioButton("c");
		GridBagConstraints gbc_rdbtnC_9 = new GridBagConstraints();
		gbc_rdbtnC_9.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnC_9.gridx = 0;
		gbc_rdbtnC_9.gridy = 23;
		contentPane.add(rdbtnC_9, gbc_rdbtnC_9);
		
		JRadioButton rdbtnC_10 = new JRadioButton("c");
		GridBagConstraints gbc_rdbtnC_10 = new GridBagConstraints();
		gbc_rdbtnC_10.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnC_10.gridx = 13;
		gbc_rdbtnC_10.gridy = 23;
		contentPane.add(rdbtnC_10, gbc_rdbtnC_10);
		
		JRadioButton rdbtnC_11 = new JRadioButton("c");
		GridBagConstraints gbc_rdbtnC_11 = new GridBagConstraints();
		gbc_rdbtnC_11.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnC_11.gridx = 26;
		gbc_rdbtnC_11.gridy = 23;
		contentPane.add(rdbtnC_11, gbc_rdbtnC_11);
		
		JRadioButton rdbtnD_9 = new JRadioButton("d");
		GridBagConstraints gbc_rdbtnD_9 = new GridBagConstraints();
		gbc_rdbtnD_9.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnD_9.gridx = 0;
		gbc_rdbtnD_9.gridy = 24;
		contentPane.add(rdbtnD_9, gbc_rdbtnD_9);
		
		JRadioButton rdbtnD_10 = new JRadioButton("d");
		GridBagConstraints gbc_rdbtnD_10 = new GridBagConstraints();
		gbc_rdbtnD_10.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnD_10.gridx = 13;
		gbc_rdbtnD_10.gridy = 24;
		contentPane.add(rdbtnD_10, gbc_rdbtnD_10);
		
		JRadioButton rdbtnD_11 = new JRadioButton("d");
		GridBagConstraints gbc_rdbtnD_11 = new GridBagConstraints();
		gbc_rdbtnD_11.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnD_11.gridx = 26;
		gbc_rdbtnD_11.gridy = 24;
		contentPane.add(rdbtnD_11, gbc_rdbtnD_11);
		
		JButton btnShowCorrectAnswers = new JButton("Show correct answers");
		GridBagConstraints gbc_btnShowCorrectAnswers = new GridBagConstraints();
		gbc_btnShowCorrectAnswers.insets = new Insets(0, 0, 0, 5);
		gbc_btnShowCorrectAnswers.gridx = 31;
		gbc_btnShowCorrectAnswers.gridy = 24;
		contentPane.add(btnShowCorrectAnswers, gbc_btnShowCorrectAnswers);
		
		JButton btnMainMenu = new JButton("Main menu");
		GridBagConstraints gbc_btnMainMenu = new GridBagConstraints();
		gbc_btnMainMenu.gridx = 33;
		gbc_btnMainMenu.gridy = 24;
		contentPane.add(btnMainMenu, gbc_btnMainMenu);
	}

}
