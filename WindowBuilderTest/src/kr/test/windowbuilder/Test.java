package kr.test.windowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Test extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=131,319
	 */
	private final JLabel label = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][]", "[][][][][][][]"));
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("New JGoodies label");
		contentPane.add(lblNewJgoodiesLabel, "cell 1 3");
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");
		contentPane.add(lblNewJgoodiesTitle, "cell 1 6");
	}

}
