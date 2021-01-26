import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMenu frame = new AddMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 608);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setBackground(Color.DARK_GRAY);
		btnAdd.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnAdd.setBounds(113, 446, 126, 45);
		contentPane.add(btnAdd);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(Color.DARK_GRAY);
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnReset.setBounds(438, 446, 126, 45);
		contentPane.add(btnReset);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setBackground(Color.DARK_GRAY);
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				MainMenu.main(null);
			}
		});
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturn.setBounds(613, 535, 89, 23);
		contentPane.add(btnReturn);
		
		JLabel label = new JLabel("");
		Image Images = new ImageIcon(this.getClass().getResource("/lightning-icon (1).png")).getImage();
		label.setIcon(new ImageIcon(Images));
		label.setBounds(78, 0, 126, 114);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("GIGAWATT FORM");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Imprint MT Shadow", Font.BOLD, 47));
		lblNewLabel.setBounds(155, 25, 545, 56);
		contentPane.add(lblNewLabel);
		
		JLabel lblBillDate = new JLabel("Bill Date");
		lblBillDate.setForeground(Color.WHITE);
		lblBillDate.setFont(new Font("Arial", Font.PLAIN, 15));
		lblBillDate.setBounds(30, 134, 89, 21);
		contentPane.add(lblBillDate);
		
		JLabel lblAccountNumber = new JLabel("Account Number");
		lblAccountNumber.setForeground(Color.WHITE);
		lblAccountNumber.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAccountNumber.setBounds(30, 174, 141, 21);
		contentPane.add(lblAccountNumber);
		
		JLabel lblOwnerName = new JLabel("Owner Name");
		lblOwnerName.setForeground(Color.WHITE);
		lblOwnerName.setFont(new Font("Arial", Font.PLAIN, 15));
		lblOwnerName.setBounds(30, 215, 141, 25);
		contentPane.add(lblOwnerName);
		
		JLabel lblOwnerAddress = new JLabel("Owner Address");
		lblOwnerAddress.setForeground(Color.WHITE);
		lblOwnerAddress.setFont(new Font("Arial", Font.PLAIN, 15));
		lblOwnerAddress.setBounds(30, 251, 141, 34);
		contentPane.add(lblOwnerAddress);
		
		JLabel lblArrears = new JLabel("Arrears");
		lblArrears.setForeground(Color.WHITE);
		lblArrears.setFont(new Font("Arial", Font.PLAIN, 15));
		lblArrears.setBounds(30, 296, 141, 29);
		contentPane.add(lblArrears);
		
		JLabel lblPreviousMeter = new JLabel("Previous Meter Reading");
		lblPreviousMeter.setForeground(Color.WHITE);
		lblPreviousMeter.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPreviousMeter.setBounds(30, 336, 170, 28);
		contentPane.add(lblPreviousMeter);
		
		JLabel lblCurrentMeterReading = new JLabel("Current Meter Reading");
		lblCurrentMeterReading.setForeground(Color.WHITE);
		lblCurrentMeterReading.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCurrentMeterReading.setBounds(30, 379, 170, 23);
		contentPane.add(lblCurrentMeterReading);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 92, 692, 5);
		contentPane.add(panel);
		
		textField = new JTextField();
		textField.setBounds(207, 135, 452, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(207, 175, 452, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(207, 218, 452, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(207, 260, 452, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(207, 301, 452, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(207, 342, 452, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(207, 381, 452, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
	}
}
