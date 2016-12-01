import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import java.awt.Canvas;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ilg {

	private JFrame frame;
	private ImageIcon image;
	private String goodAnswer;
	private int[] answer=new int[2];
	private String question;
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ilg window = new Ilg("Where is the payload?","310;345;10;75",new ImageIcon("test.png"));
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ilg(String question,String answer,ImageIcon image) {
		this.question=question;
		this.goodAnswer=answer;
		this.image=image;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
		);
//  xmin;xmax;ymin;ymax
		JLabel lblpos = new JLabel("New label");
		lblpos.setBounds(53, 676, 237, 16);
		
		JLabel lblimage = new JLabel("");
		lblimage.setBounds(139, 42, 700, 475);

		JLabel lblpointer = new JLabel("");
		lblpointer.setBounds(412, 393, 40, 40);
		lblpointer.setIcon(new ImageIcon("pointer.png"));
		lblpointer.setOpaque(false);
		lblpointer.setVisible(false);
		lblimage.setIcon(image);
		lblimage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				lblpos.setText("X :" + arg0.getX()+" ; Y: "+arg0.getY());
				lblpointer.setLocation(139+arg0.getX()-20, 42+arg0.getY()-40);
				answer[0]=arg0.getX();
				answer[1]=arg0.getY();
				lblpointer.setVisible(true);
				
			}
		});
		panel.setLayout(null);
		panel.add(lblpointer);
		panel.add(lblimage);
		panel.add(lblpos);
		
		JLabel lblquest = new JLabel(question);
		lblquest.setBounds(437, 13, 345, 16);
		panel.add(lblquest);
		
		JButton btnValid = new JButton("Valid");
		btnValid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String []split=goodAnswer.split(";");
				if (answer[0]>Integer.parseInt(split[0])&&answer[0]<Integer.parseInt(split[1])&&answer[1]>Integer.parseInt(split[2])&&answer[1]<Integer.parseInt(split[3])) lblpos.setText("good answer");
				else lblpos.setText("wrong answer");
			}
		});
		btnValid.setBounds(269, 702, 97, 25);
		panel.add(btnValid);
		frame.getContentPane().setLayout(groupLayout);
	}
}
