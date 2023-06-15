package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration_page {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_page window = new Registration_page();
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
	public Registration_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 102, 255));
		frame.setBackground(new Color(204, 102, 204));
		frame.setBounds(100, 100, 508, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrRegisteration = new JTextArea();
		txtrRegisteration.setBackground(new Color(204, 51, 204));
		txtrRegisteration.setFont(new Font("Tahoma", Font.BOLD, 29));
		txtrRegisteration.setText("     Registration");
		txtrRegisteration.setBounds(163, 26, 291, 54);
		frame.getContentPane().add(txtrRegisteration);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setText("Name");
		txtrName.setFont(new Font("Tahoma", Font.BOLD, 28));
		txtrName.setBackground(new Color(204, 51, 204));
		txtrName.setBounds(65, 106, 93, 38);
		frame.getContentPane().add(txtrName);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setText("Email");
		txtrEmail.setFont(new Font("Tahoma", Font.BOLD, 28));
		txtrEmail.setBackground(new Color(204, 51, 204));
		txtrEmail.setBounds(65, 164, 93, 38);
		frame.getContentPane().add(txtrEmail);
		
		JTextArea txtrPhNo = new JTextArea();
		txtrPhNo.setText("Ph No");
		txtrPhNo.setFont(new Font("Tahoma", Font.BOLD, 28));
		txtrPhNo.setBackground(new Color(204, 51, 204));
		txtrPhNo.setBounds(65, 222, 93, 38);
		frame.getContentPane().add(txtrPhNo);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(182, 106, 125, 36);
		frame.getContentPane().add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(182, 164, 125, 36);
		frame.getContentPane().add(formattedTextField_1);
		
		JFormattedTextField formattedTextField_1_1 = new JFormattedTextField();
		formattedTextField_1_1.setBounds(182, 224, 125, 36);
		frame.getContentPane().add(formattedTextField_1_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {JOptionPane.showMessageDialog(btnNewButton, "Registration Done");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnNewButton.setBounds(218, 332, 160, 45);
		frame.getContentPane().add(btnNewButton);
	}
}
