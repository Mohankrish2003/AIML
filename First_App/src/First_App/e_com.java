package First_App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class e_com {
	int i=0;

	private JFrame frame;
	private JTextField txtRs;
	private JTextField txtRs_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					e_com window = new e_com();
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
	public e_com() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 841, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AMAZON");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(334, 22, 135, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\book_1.jpg"));
		lblNewLabel_2.setBounds(377, 112, 46, 101);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\book_1.jpg"));
		lblNewLabel_3.setBounds(419, 48, 96, 210);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\book_4.jpg"));
		lblNewLabel_1.setBounds(38, 80, 141, 217);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\book_3.jfif"));
		lblNewLabel_4.setBounds(265, 80, 135, 217);
		frame.getContentPane().add(lblNewLabel_4);
		
		txtRs = new JTextField();
		txtRs.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		txtRs.setText("Rs.120");
		txtRs.setBounds(69, 339, 86, 31);
		frame.getContentPane().add(txtRs);
		txtRs.setColumns(10);
		
		txtRs_1 = new JTextField();
		txtRs_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		txtRs_1.setText("Rs.140");
		txtRs_1.setBounds(272, 339, 86, 29);
		frame.getContentPane().add(txtRs_1);
		txtRs_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "PDF", "PAPER", "KINDEL"}));
		comboBox.setBounds(69, 381, 73, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "pdf", "paper", "kindel"}));
		comboBox_1.setBounds(265, 379, 104, 22);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnNewButton = new JButton("Add to cart");
		JLabel lb = new JLabel("CART  :");
		lb.setBounds(640, 22, 73, 14);
		frame.getContentPane().add(lb);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			 public void actionPerformed(ActionEvent e) {
				i++; 
				lb.setText("CART : "+i);
			}
		});
		btnNewButton.setBounds(66, 425, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to cart");
		btnNewButton_1.setBounds(269, 425, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Bill:0");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_5.setBounds(652, 48, 104, 22);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
