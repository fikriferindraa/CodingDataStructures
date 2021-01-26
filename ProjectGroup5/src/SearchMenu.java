import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class SearchMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchMenu frame = new SearchMenu();
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
	public SearchMenu() {
		setForeground(Color.GREEN);
		setBackground(Color.GREEN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 549);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		Image Images = new ImageIcon(this.getClass().getResource("/lightning-icon (1).png")).getImage();
		label.setIcon(new ImageIcon(Images));
		label.setBounds(149, 0, 80, 107);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("GIGAWATT");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Imprint MT Shadow", Font.BOLD, 47));
		lblNewLabel.setBounds(218, 21, 545, 56);
		contentPane.add(lblNewLabel);
		
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
		btnReturn.setBounds(565, 476, 89, 23);
		contentPane.add(btnReturn);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 91, 644, 4);
		contentPane.add(panel);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setBackground(Color.DARK_GRAY);
		btnEdit.setFont(new Font("Arial", Font.BOLD, 14));
		btnEdit.setBounds(116, 423, 113, 34);
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(Color.DARK_GRAY);
		btnDelete.setFont(new Font("Arial", Font.BOLD, 14));
		btnDelete.setBounds(421, 423, 113, 34);
		contentPane.add(btnDelete);
		
		textField = new JTextField();
		textField.setBounds(51, 131, 296, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setBackground(Color.DARK_GRAY);
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(379, 129, 89, 23);
		contentPane.add(btnSearch);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(28, 180, 606, 209);
		contentPane.add(textArea);
		
		
	}
}
