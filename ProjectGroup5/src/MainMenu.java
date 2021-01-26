import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 921, 566);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGigawatt = new JLabel("GIGAWATT");
		lblGigawatt.setForeground(Color.YELLOW);
		lblGigawatt.setFont(new Font("Imprint MT Shadow", Font.BOLD | Font.ITALIC, 99));
		lblGigawatt.setBounds(187, 0, 662, 153);
		contentPane.add(lblGigawatt);
		
		JLabel lblLightIsThe = new JLabel("Light is The Key of Life");
		lblLightIsThe.setFont(new Font("SimSun-ExtB", Font.BOLD, 18));
		lblLightIsThe.setForeground(Color.WHITE);
		lblLightIsThe.setBounds(372, 112, 249, 42);
		contentPane.add(lblLightIsThe);
		
		JLabel lblNewLabel = new JLabel("");
		Image Images = new ImageIcon(this.getClass().getResource("/lightning-icon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(Images));
		lblNewLabel.setBounds(54, 0, 167, 185);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(10, 164, 885, 4);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("TABLE");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false);
				dispose();
				TableMenu.main(null);
			}
		});
		btnNewButton.setBounds(638, 284, 197, 82);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				AddMenu.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton_1.setBounds(59, 284, 197, 82);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SEARCH");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				SearchMenu.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton_2.setBounds(347, 284, 197, 82);
		contentPane.add(btnNewButton_2);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.DARK_GRAY);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(JOptionPane.showConfirmDialog(null,"Confirm if you want to exit","Gigawatt Menu",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnExit.setBounds(806, 493, 89, 23);
		contentPane.add(btnExit);
	}
}
