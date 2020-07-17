package javaswing; 
  
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel; 
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class numbersystem {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					numbersystem window = new numbersystem();
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
	public numbersystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setBounds(6, 6, 438, 52);
		frame.getContentPane().add(panel1);
		
		JLabel label1 = new JLabel("Number System");
		label1.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		panel1.add(label1);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 59, 438, 213);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label2 = new JLabel("Enter the number:");
		label2.setBounds(46, 5, 211, 30);
		label2.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		panel.add(label2);
		
		textField1 = new JTextField();
		textField1.setBounds(262, 7, 130, 26);
		panel.add(textField1);
		textField1.setColumns(10);
		
		JLabel label3 = new JLabel("Result is:");
		label3.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		label3.setBounds(62, 60, 159, 43);
		panel.add(label3);
		
		textField2 = new JTextField();
		textField2.setBounds(194, 72, 130, 26);
		panel.add(textField2);
		textField2.setColumns(10);
		
		JButton button1 = new JButton("Binary");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//adding toBinaryString function 
				int num;
				String ans;
				num=Integer.parseInt(textField1.getText());
				ans=Integer.toBinaryString(num);
				textField2.setText(ans);
			}
		});
		button1.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		button1.setBounds(6, 164, 124, 43);
		panel.add(button1);
		
		JButton button2 = new JButton("Octal");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num;
				String ans;
				num=Integer.parseInt(textField1.getText());
				ans=Integer.toOctalString(num);
				textField2.setText(ans);
			}
		});
		button2.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		button2.setBounds(127, 164, 117, 43);
		panel.add(button2);
		
		JButton button3 = new JButton("Hexadecimal");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num;
				String ans;
				num=Integer.parseInt(textField1.getText());
				ans=Integer.toHexString(num);
				textField2.setText(ans);
			}
		});
		button3.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		button3.setBounds(242, 164, 160, 43);
		panel.add(button3);
		
		JButton button4 = new JButton("decimal");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//adding toString function
				int num;
				String ans;
				num=Integer.parseInt(textField1.getText());
				ans=Integer.toString(num);
				textField2.setText(ans);
			}
		});
		button4.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		button4.setBounds(25, 115, 133, 43);
		panel.add(button4);
	}
}
