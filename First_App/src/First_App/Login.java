package First_App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField t1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 737, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblNewLabel.setBounds(289, 11, 144, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(74, 157, 117, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(74, 243, 144, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(274, 156, 144, 34);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email=t1.getText();
				String password=p1.getText();
				if(email.equals("raj@gmail.com")
						&& password.equals("1234"))
				{
				JOptionPane.showMessageDialog(btnNewButton,"Login Successful!");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Invalid");
				}
			}
		} );
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(184, 328, 89, 34);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(325, 243, 5, 22);
		frame.getContentPane().add(textArea);
		
		p1 = new JPasswordField();
		p1.setBounds(274, 234, 144, 34);
		frame.getContentPane().add(p1);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
