package Account_Data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Registration_data<callableStatement> {

	private JFrame frame;
	private JTextField T1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_data window = new Registration_data();
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
	public Registration_data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 790, 671);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 24));
		lblNewLabel.setBounds(285, 28, 234, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(44, 134, 125, 87);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(44, 232, 125, 87);
		frame.getContentPane().add(lblNewLabel_2);
		
		T1 = new JTextField();
		T1.setBounds(216, 155, 317, 35);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JRadioButton RB1 = new JRadioButton("Male");
		RB1.setFont(new Font("Arial", Font.PLAIN, 18));
		RB1.setForeground(Color.BLACK);
		RB1.setBackground(Color.ORANGE);
		RB1.setBounds(216, 247, 125, 35);
		frame.getContentPane().add(RB1);
		
		JRadioButton RB2 = new JRadioButton("Female");
		RB2.setFont(new Font("Arial", Font.PLAIN, 18));
		RB2.setForeground(Color.BLACK);
		RB2.setBackground(Color.ORANGE);
		RB2.setBounds(375, 247, 125, 35);
		frame.getContentPane().add(RB2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(RB1);
		bg.add(RB2);
		
		
		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(44, 340, 96, 56);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Programming");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(36, 426, 156, 75);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox co = new JComboBox();
		co.setFont(new Font("Arial", Font.PLAIN, 15));
		co.setModel(new DefaultComboBoxModel(new String[] {"Select", "ECE", "CSE", "AIML", "EEE", "MECH"}));
		co.setBackground(Color.LIGHT_GRAY);
		co.setBounds(216, 359, 234, 25);
		frame.getContentPane().add(co);
		
		JCheckBox CB1 = new JCheckBox("JAVA\r\n");
		CB1.setForeground(Color.BLACK);
		CB1.setFont(new Font("Arial", Font.PLAIN, 18));
		CB1.setBackground(Color.ORANGE);
		CB1.setBounds(226, 448, 96, 35);
		frame.getContentPane().add(CB1);
		
		JCheckBox CB2 = new JCheckBox("PYTHON");
		CB2.setForeground(Color.BLACK);
		CB2.setBackground(Color.ORANGE);
		CB2.setFont(new Font("Arial", Font.PLAIN, 18));
		CB2.setBounds(324, 448, 101, 35);
		frame.getContentPane().add(CB2);
		
		JButton btnNewButton = new JButton("SUBMIT\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=T1.getText();
				String g;
				if(RB1.isSelected())
				{
					g="Male";
				}
				else if(RB2.isSelected())
				{
					g="Female";
				}
				else
				{
					g="Invaild";
				}
				String b=(String) co.getSelectedItem();
				String p1=" ";
				if(CB1.isSelected())
				{
					p1=p1+"JAVA";
				}
				 if(CB2.isSelected())
				{
					p1=p1+"PYTHON";
				}
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aimls","root","mrec");
					String q="insert into registration values('"+n+"','"+g+"','"+b+"','"+p1+"')";
					Statement sta=con.createStatement();
					sta.execute(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton, "Done");
					} catch(SQLException e1) {
						e1.printStackTrace();
					}
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(224, 533, 173, 35);
		frame.getContentPane().add(btnNewButton);
	}
}
