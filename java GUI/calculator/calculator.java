package javaGui;
/* changes done at some places*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {
 
	private JFrame frame;
	private JTextField textFieldnum1;
	private JTextField textFieldnum2;
	private JTextField textFieldans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
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
		
		textFieldnum1 = new JTextField();
		textFieldnum1.setBounds(16, 6, 186, 26);
		frame.getContentPane().add(textFieldnum1);
		textFieldnum1.setColumns(10);
		
		textFieldnum2 = new JTextField();
		textFieldnum2.setBounds(239, 6, 186, 26);
		frame.getContentPane().add(textFieldnum2);
		textFieldnum2.setColumns(10);
		
		JButton add = new JButton("add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldnum1.getText());
					num2=Integer.parseInt(textFieldnum2.getText());
					ans=num1+num2;
					textFieldans.setText(Integer.toString(ans));
				}catch(Exception e)
				{
					System.out.println("Enter a valid number");	
				}
			}
		});
		add.setBounds(47, 84, 117, 29);
		frame.getContentPane().add(add);
		
		JButton minus = new JButton("minus");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				int num1,num2,ans;
				try{num1=Integer.parseInt(textFieldnum1.getText());
				num2=Integer.parseInt(textFieldnum2.getText());
				ans=num1-num2;
				textFieldans.setText(Integer.toString(ans));}
				catch(Exception e)
				{
					System.out.println("Enter a valid number");	
				}
				
			}
		});
		minus.setBounds(246, 84, 117, 29);
		frame.getContentPane().add(minus);
		
		JLabel lblNewLabel = new JLabel("the answer is:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		lblNewLabel.setBounds(33, 173, 196, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldans = new JTextField();
		textFieldans.setBounds(239, 177, 156, 46);
		frame.getContentPane().add(textFieldans);
		textFieldans.setColumns(10);
	}
}
