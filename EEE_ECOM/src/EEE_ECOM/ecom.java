package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

import java.awt.Font;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecom {

	protected static final JTextComponent LB2 = null;
	private JFrame frame;
	int i=0;
	int TP=0;
	private JLabel LB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecom window = new ecom();
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
	public ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 482, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(149, 59, 107, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\az1.jpg"));
		lblNewLabel_1.setBounds(29, 118, 115, 151);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\az2.jpg"));
		lblNewLabel_2.setBounds(149, 113, 115, 161);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\r\n");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\az3.jpg"));
		lblNewLabel_3.setBounds(274, 102, 138, 183);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS 110");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setForeground(new Color(51, 255, 0));
		lblNewLabel_4.setBounds(29, 239, 76, 48);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS 140");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setForeground(new Color(204, 0, 153));
		lblNewLabel_5.setBounds(135, 254, 101, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RS180");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setForeground(new Color(204, 51, 51));
		lblNewLabel_6.setBounds(265, 254, 81, 18);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lb2 = new JLabel("Total price=0");
		lb2.setFont(new Font("Sitka Text", Font.BOLD, 14));
		lb2.setBounds(295, 69, 141, 20);
		frame.getContentPane().add(lb2);
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KINDEL", "BOOK", "PDF"}));
		comboBox.setBounds(29, 280, 76, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KINDEL", "BOOK", "PDF"}));
		comboBox_1.setBounds(159, 280, 70, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KINDEL", "BOOK", "PDF"}));
		comboBox_2.setBounds(275, 280, 71, 22);
		frame.getContentPane().add(comboBox_2);
		
		JButton btnNewButton = new JButton("Add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			
		    public void actionPerformed(ActionEvent e) {
		    	i++;
		    	LB.setText("CART : "+i);
		    	TP = TP+110;
		    	lb2.setText("Total price:"+TP);
			}
		});
		btnNewButton.setBounds(16, 321, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAddToCart = new JButton("ADD TO CART");
		btnAddToCart.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
		    	LB.setText("CART : "+i);
		    	TP = TP+140;
		    	lb2.setText("Total price:"+TP);
			}
		});
		btnAddToCart.setBounds(147, 321, 89, 23);
		frame.getContentPane().add(btnAddToCart);
		
		JButton btnNewButton_1_1 = new JButton("ADD TO CART");
		btnNewButton_1_1.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				i++;
		    	LB.setText("CART : "+i);
		    	TP = TP+180;
		    	lb2.setText("Total price:"+TP);
			}
		});
		btnNewButton_1_1.setBounds(265, 313, 89, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		LB = new JLabel("CART :0");
		LB.setFont(new Font("Sitka Banner", Font.BOLD, 14));
		LB.setBounds(335, 11, 76, 31);
		frame.getContentPane().add(LB);
		
		
	}
}
