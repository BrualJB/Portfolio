import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPage extends JFrame {

	protected static final Window Jframe = null;
	private JPanel Firstpage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage frame = new FirstPage();
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
	public FirstPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 537);
		Firstpage = new JPanel();
		Firstpage.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Firstpage);
		Firstpage.setLayout(null);
		
		JButton btnNewButton = new JButton("About");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About abt = new About();
				abt.setVisible(true);
				dispose();
			}	
		});
		btnNewButton.setBounds(351, 379, 118, 23);
		Firstpage.add(btnNewButton);
		
		JButton btnSchoolAttended = new JButton("School Attended");
		btnSchoolAttended.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SchoolAttended Sa = new SchoolAttended();
				Sa.setVisible(true);
				dispose();
			}
		});
		btnSchoolAttended.setBounds(351, 413, 118, 23);
		Firstpage.add(btnSchoolAttended);
		
		JButton btnHobbies = new JButton("Hobbies");
		btnHobbies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hobbies H = new Hobbies();
				H.setVisible(true);
				dispose();
			}
		});
		btnHobbies.setBounds(351, 447, 118, 23);
		Firstpage.add(btnHobbies);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\emman\\OneDrive\\Pictures\\Portfolio.png"));
		lblNewLabel.setBounds(0, 0, 496, 498);
		Firstpage.add(lblNewLabel);
	}
}
