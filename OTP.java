import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class OTP {

	private JFrame frame;
	private JPasswordField passwordField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OTP window = new OTP();
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
	public OTP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(234, 147, 133, 33);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Enter OTP");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 145, 133, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(26, 11, 398, 98);
		frame.getContentPane().add(lblNewLabel_1);
		
		Image img= new ImageIcon(this.getClass().getResource("/1234.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		
		btnNewButton = new JButton("SUBMIT");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(136, 204, 102, 33);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(passwordField.getText().equals("021121"))
				{
					JOptionPane.showMessageDialog(frame, "Welcome");
					new Info();
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Invalid OTP");
				}
			}
			
		});
		
	}

}
