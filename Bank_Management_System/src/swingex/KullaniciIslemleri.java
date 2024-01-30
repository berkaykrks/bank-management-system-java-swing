package swingex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bank.BakiyeOgren;
import bank.KrediOdeme;
import bank.ParaCek;
import bank.ParaYatir;
import bank.TransferYap;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class KullaniciIslemleri extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KullaniciIslemleri frame = new KullaniciIslemleri();
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
	 
	
	public KullaniciIslemleri() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 313);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Para Yatır");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaYatir paraYatir = new ParaYatir();
				paraYatir.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton_1.setBounds(62, 72, 307, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Para Çek");
		btnNewButton_1_1.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaCek paraCek = new ParaCek();
				paraCek.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(62, 27, 307, 35);
		contentPane.add(btnNewButton_1_1);
		
		
		
		JButton btnNewButton_1_2 = new JButton("Bakiye Öğren");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BakiyeOgren bakiye = new BakiyeOgren();
				bakiye.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1_2.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton_1_2.setBounds(62, 118, 307, 35);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Transfer Yap");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransferYap transferYap = new TransferYap();
				transferYap.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_3.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton_1_3.setBounds(62, 164, 307, 35);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_3_1 = new JButton("Kredi Ödeme");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KrediOdeme krediOdeme = new KrediOdeme();
				krediOdeme.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_3_1.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton_1_3_1.setBounds(62, 210, 307, 35);
		contentPane.add(btnNewButton_1_3_1);
	}

}
