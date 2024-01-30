package swingex;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import DataRead.KimlikVeri;
import DataRead.kullaniciVerileri;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;



public class KullaniciGiris extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KullaniciGiris frame = new KullaniciGiris();
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
	private static final String JSON_FILE_PATH = "C:\\Users\\berka\\OneDrive\\Masaüstü\\bank\\Bank_Management\\src\\veri.json";
	
	public KullaniciGiris() {
		setTitle("Uygulamaya Giriş");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(246, 52, 146, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(246, 106, 146, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("TC Kimlik Numaranizi Giriniz :");
		lblNewLabel.setFont(new Font("Lucida Fax", Font.ITALIC, 14));
		lblNewLabel.setBounds(10, 49, 226, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblSifreniziGiriniz = new JLabel("Sifrenizi Giriniz :");
		lblSifreniziGiriniz.setFont(new Font("Lucida Fax", Font.ITALIC, 14));
		lblSifreniziGiriniz.setBounds(10, 103, 226, 23);
		contentPane.add(lblSifreniziGiriniz);
		
		
		
		JButton btnNewButton = new JButton("Giris");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				KimlikVeri.setTc(textField.getText());
				KimlikVeri.setSifre(textField_1.getText());
				
				boolean giris = false;
				
				String tc = textField.getText();
				String sifre = textField_1.getText();
				
				try (FileReader reader = new FileReader(JSON_FILE_PATH)){
					Gson gson = new Gson();
					java.lang.reflect.Type listType = new TypeToken<List<kullaniciVerileri>>() {}.getType();
			        List<kullaniciVerileri> customers = gson.fromJson(reader, listType);
			        for(kullaniciVerileri customer : customers){
			        	if (tc.equals(customer.getTcKimlik()) && sifre.equals(customer.getSifre())) {
			        	    giris = true;
			        	    KullaniciIslemleri kullanıcıEkran = new KullaniciIslemleri();
			        	    kullanıcıEkran.setVisible(true);
			        	    dispose();
			        	}
			        }
			        if (!giris) {
		                JOptionPane.showMessageDialog(null, "Girdiğiniz değerleri kontrol ediniz.");
		            }
				} catch (Exception e1) {
					 e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Poor Richard", Font.PLAIN, 17));
		btnNewButton.setBounds(249, 151, 114, 34);
		contentPane.add(btnNewButton);
		
		JButton btnKaytOl = new JButton("Kayıt Ol");
		btnKaytOl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KullaniciKayit kayit = new KullaniciKayit();
				kayit.setVisible(true);
				dispose();
			}
		});
		btnKaytOl.setFont(new Font("Poor Richard", Font.PLAIN, 17));
		btnKaytOl.setBounds(82, 151, 114, 34);
		contentPane.add(btnKaytOl);
		
		
	}
}
