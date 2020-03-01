package javaGui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class jframedemo {

	private JFrame frame;
	private JTextField txtMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframedemo window = new jframedemo();
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
	public jframedemo() {
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
		
		JButton btnNewButton = new JButton("new one");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMessage.setText("Hiii You tube");
			}
		});
		btnNewButton.setForeground(Color.PINK);
		btnNewButton.setBackground(new Color(139, 0, 0));
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		btnNewButton.setBounds(145, 127, 155, 66);
		frame.getContentPane().add(btnNewButton);
		
		txtMessage = new JTextField();
		txtMessage.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		txtMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtMessage.setText("Message");
		txtMessage.setBounds(50, 31, 290, 66);
		frame.getContentPane().add(txtMessage);
		txtMessage.setColumns(10);
	}
}
