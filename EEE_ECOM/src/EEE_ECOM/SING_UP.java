package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SING_UP {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SING_UP window = new SING_UP();
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
	public SING_UP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 153, 51));
		frame.setBackground(new Color(153, 153, 51));
		frame.setBounds(100, 100, 491, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGNUP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(187, 26, 97, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 102, 127, 54);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("GENDER");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 167, 103, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 213, 154, 28);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PROGRAMMING");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 252, 154, 89);
		frame.getContentPane().add(lblNewLabel_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(114, 119, 90, 22);
		frame.getContentPane().add(textArea);
		
		JRadioButton rb1 = new JRadioButton("FEMALE");
		rb1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rb1.setBounds(95, 175, 109, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("MALE");
		rb2.setFont(new Font("Tahoma", Font.BOLD, 15));
		rb2.setBounds(258, 179, 109, 23);
		frame.getContentPane().add(rb2);
		
		JComboBox cb = new JComboBox();
		cb.setFont(new Font("Tahoma", Font.BOLD, 15));
		cb.setModel(new DefaultComboBoxModel(new String[] {"SELECT"}));
		cb.setBounds(138, 218, 90, 35);
		frame.getContentPane().add(cb);
		
		JCheckBox cb1 = new JCheckBox("JAVA");
		cb1.setFont(new Font("Tahoma", Font.BOLD, 15));
		cb1.setBounds(142, 287, 97, 23);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("PYTHON");
		cb2.setFont(new Font("Tahoma", Font.BOLD, 15));
		cb2.setBounds(258, 287, 97, 23);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("'C'");
		cb3.setFont(new Font("Tahoma", Font.BOLD, 15));
		cb3.setBounds(372, 287, 97, 23);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(187, 344, 120, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
