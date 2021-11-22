import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Info {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Info window = new Info();
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
	public Info() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Total Stock");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 0, 141, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Items           |        Quantity");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 41, 192, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rice              :        1000kg");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 66, 192, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Wheat           :        500kg");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 99, 192, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sugar            :        300kg");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 132, 192, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Distributed Stock");
		lblNewLabel_5.setForeground(Color.ORANGE);
		lblNewLabel_5.setFont(new Font("SansSerif", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(224, 0, 200, 28);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("Items           |        Quantity");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(221, 41, 192, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("Rice             :");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(224, 68, 93, 19);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(327, 68, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_6_1 = new JLabel("Wheat          :");
		lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_6_1.setBounds(224, 101, 98, 19);
		frame.getContentPane().add(lblNewLabel_6_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(327, 101, 86, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Sugar           :");
		lblNewLabel_6_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_6_2.setBounds(224, 130, 93, 19);
		frame.getContentPane().add(lblNewLabel_6_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(327, 130, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRemainingStock = new JLabel("Remaining Stock");
		lblRemainingStock.setForeground(Color.RED);
		lblRemainingStock.setFont(new Font("SansSerif", Font.PLAIN, 25));
		lblRemainingStock.setBackground(Color.RED);
		lblRemainingStock.setBounds(112, 172, 228, 30);
		frame.getContentPane().add(lblRemainingStock);
		
		JLabel lblNewLabel_1_2 = new JLabel("Items           |        Quantity");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(10, 232, 192, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("Rice             :");
		lblNewLabel_6_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_6_3.setBounds(10, 268, 93, 19);
		frame.getContentPane().add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_4 = new JLabel("");
		lblNewLabel_6_4.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_6_4.setBounds(126, 268, 76, 19);
		frame.getContentPane().add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Wheat          :");
		lblNewLabel_6_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_6_1_1.setBounds(10, 307, 98, 19);
		frame.getContentPane().add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_4_1 = new JLabel("");
		lblNewLabel_6_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_6_4_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_4_1.setBounds(126, 307, 76, 19);
		frame.getContentPane().add(lblNewLabel_6_4_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Sugar           :");
		lblNewLabel_6_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_6_2_1.setBounds(10, 344, 93, 19);
		frame.getContentPane().add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_6_4_1_1 = new JLabel("");
		lblNewLabel_6_4_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_6_4_1_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6_4_1_1.setBounds(126, 344, 76, 19);
		frame.getContentPane().add(lblNewLabel_6_4_1_1);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBounds(183, 374, 89, 33);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int r = Integer.parseInt(textField.getText());
				int r1= 1000-r;
				String res = new Integer(r1).toString();
				lblNewLabel_6_4.setText(res);
				
				int w = Integer.parseInt(textField_1.getText());
				int w1= 500-w;
				String res1 = new Integer(w1).toString();
				lblNewLabel_6_4_1.setText(res1);
				
				int s = Integer.parseInt(textField_2.getText());
				int s1= 300-s;
				String res2 = new Integer(s1).toString();
				lblNewLabel_6_4_1_1.setText(res2);
							
			}
			
		});
		
	}
}
