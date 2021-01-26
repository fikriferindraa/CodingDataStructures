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
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableMenu extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableMenu frame = new TableMenu();
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
	public TableMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 637);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		Image Images = new ImageIcon(this.getClass().getResource("/lightning-icon (1).png")).getImage();
		label.setIcon(new ImageIcon(Images));
		label.setBounds(274, 0, 73, 103);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("GIGAWATT");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Imprint MT Shadow", Font.BOLD, 47));
		lblNewLabel.setBounds(343, 0, 310, 93);
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
		btnReturn.setBounds(804, 564, 89, 23);
		contentPane.add(btnReturn);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 87, 883, 5);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(25, 116, 852, 422);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBackground(Color.DARK_GRAY);
		table.setForeground(Color.WHITE);
		table.setBounds(0, 0, 832, -402);
		panel_1.add(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Total Bill", "Current Charge", "Total Unit", "Arrears", "Address", "Name", "Account Number", "No."
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(105);
		table.getColumnModel().getColumn(1).setPreferredWidth(111);
		table.getColumnModel().getColumn(2).setPreferredWidth(126);
		table.getColumnModel().getColumn(3).setPreferredWidth(114);
		table.getColumnModel().getColumn(4).setPreferredWidth(153);
		table.getColumnModel().getColumn(5).setPreferredWidth(196);
		table.getColumnModel().getColumn(6).setPreferredWidth(146);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 852, -412);
		panel_1.add(scrollPane);
	}
}
