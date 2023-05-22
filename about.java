import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class About extends JFrame {

	protected static final String About = null;
	private JPanel AboutMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 528);
		AboutMe = new JPanel();
		AboutMe.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(AboutMe);
		AboutMe.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPage FP = new FirstPage();
				FP.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(206, 452, 89, 23);
		AboutMe.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\emman\\Downloads\\template.png"));
		lblNewLabel.setBounds(0, -11, 494, 510);
		AboutMe.add(lblNewLabel);
	}
}
