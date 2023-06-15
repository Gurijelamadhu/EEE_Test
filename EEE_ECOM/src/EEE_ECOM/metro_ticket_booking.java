package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metro_ticket_booking {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro_ticket_booking window = new metro_ticket_booking();
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
	public metro_ticket_booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 51, 102));
		frame.setBackground(new Color(153, 51, 153));
		frame.setBounds(100, 100, 511, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("metro ticket booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(125, 11, 338, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(255, 51, 0));
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_1.setBackground(new Color(255, 51, 51));
		lblNewLabel_1.setBounds(10, 120, 109, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("from station");
		lblNewLabel_2.setForeground(new Color(255, 0, 51));
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 172, 119, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("to station");
		lblNewLabel_3.setForeground(new Color(255, 0, 51));
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 234, 96, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(205, 154, -47, 9);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(171, 116, 139, 27);
		frame.getContentPane().add(textArea_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(171, 184, 139, 27);
		frame.getContentPane().add(textArea_1_1);
		
		JTextArea textArea_1_2 = new JTextArea();
		textArea_1_2.setBounds(171, 247, 139, 27);
		frame.getContentPane().add(textArea_1_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(60, 347, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ticket");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setForeground(new Color(255, 51, 51));
		lblNewLabel_5.setBounds(10, 305, 96, 21);
		frame.getContentPane().add(lblNewLabel_5);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(195, 318, 40, 0);
		frame.getContentPane().add(textArea_2);
		
		JTextArea textArea_1_2_1 = new JTextArea();
		textArea_1_2_1.setBounds(171, 305, 139, 27);
		frame.getContentPane().add(textArea_1_2_1);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pn=tb1.getText();
				String fr=(String) c1.getSelectedItem();
				String to=(String) c2.getSelectedItem();
				String tickets=(String) c3.getSelectedItem();
				int t=Integer.parseInt(tickets);
				int bill=t*40;
				JOPtionPane.showMessageDialog(btnNewButton)
			}
		});
		btnNewButton.setForeground(new Color(204, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(181, 347, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
