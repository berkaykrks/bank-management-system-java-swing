package swingex;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.json.JSONArray;
import org.json.JSONObject;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Button;
import javax.swing.SwingConstants;
import java.awt.TextField;
import java.awt.Label;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;


public class KullaniciKayit extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
	private JPasswordField passwordField;

	public KullaniciKayit() {
		setTitle("Uygulamaya Giriş");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 524);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Hesap Oluştur");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel_1.setBounds(151, 11, 227, 50);
		contentPane.add(lblNewLabel_1);
		
		TextField textField_Ad = new TextField();
		textField_Ad.setBounds(220, 108, 155, 22);
		contentPane.add(textField_Ad);
		
		Label label = new Label("Adınız : ");
		label.setFont(new Font("SansSerif", Font.BOLD, 16));
		label.setBounds(23, 108, 170, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Soyadınız :");
		label_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		label_1.setBounds(23, 149, 170, 22);
		contentPane.add(label_1);
		
		TextField textField_Soyad = new TextField();
		textField_Soyad.setBounds(220, 149, 155, 22);
		contentPane.add(textField_Soyad);
		
		Label label_1_1 = new Label("TC Numaranız :");
		label_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		label_1_1.setBounds(23, 194, 170, 22);
		contentPane.add(label_1_1);
		
		TextField textField_TC = new TextField();
		textField_TC.setBounds(220, 194, 155, 22);
		contentPane.add(textField_TC);
		
		Label label_2 = new Label("Adres : ");
		label_2.setFont(new Font("SansSerif", Font.BOLD, 16));
		label_2.setBounds(23, 235, 170, 22);
		contentPane.add(label_2);
		
		TextField textField_Adres = new TextField();
		textField_Adres.setBounds(220, 235, 155, 22);
		contentPane.add(textField_Adres);
		
		Label label_1_2 = new Label("Doğum Tarihiniz :");
		label_1_2.setFont(new Font("SansSerif", Font.BOLD, 16));
		label_1_2.setBounds(23, 276, 170, 22);
		contentPane.add(label_1_2);
		
		TextField textField_Dogum = new TextField();
		textField_Dogum.setBounds(220, 276, 155, 22);
		contentPane.add(textField_Dogum);
		
		Label label_1_1_1 = new Label("Telefon Numaranız :");
		label_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		label_1_1_1.setBounds(23, 321, 170, 22);
		contentPane.add(label_1_1_1);
		
		TextField textField_Tel = new TextField();
		textField_Tel.setBounds(220, 321, 155, 22);
		contentPane.add(textField_Tel);
		
		Label label_1_1_1_1 = new Label("Sifre Oluşturun :  ");
		label_1_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		label_1_1_1_1.setBounds(23, 360, 170, 22);
		contentPane.add(label_1_1_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(220, 362, 155, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_sifre = new JLabel("");
		lblNewLabel_sifre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_sifre.setBounds(406, 362, 21, 20);
		contentPane.add(lblNewLabel_sifre);
		
		JLabel lblNewLabel_tel = new JLabel("");
		lblNewLabel_tel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_tel.setBounds(381, 321, 21, 20);
		contentPane.add(lblNewLabel_tel);
		
		JLabel lblNewLabel_dog = new JLabel("");
		lblNewLabel_dog.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_dog.setBounds(381, 276, 21, 20);
		contentPane.add(lblNewLabel_dog);
		
		JLabel lblNewLabel_adres = new JLabel("");
		lblNewLabel_adres.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_adres.setBounds(381, 237, 21, 20);
		contentPane.add(lblNewLabel_adres);
		
		JLabel lblNewLabel_tc = new JLabel("");
		lblNewLabel_tc.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_tc.setBounds(381, 194, 21, 20);
		contentPane.add(lblNewLabel_tc);
		
		JLabel lblNewLabel_soy = new JLabel("");
		lblNewLabel_soy.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_soy.setBounds(381, 151, 21, 20);
		contentPane.add(lblNewLabel_soy);
		
		JLabel lblNewLabel_ad = new JLabel("");
		lblNewLabel_ad.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_ad.setBounds(381, 108, 21, 20);
		contentPane.add(lblNewLabel_ad);
		
		Label label_1_1_1_2 = new Label("Hesabınız Var mı ?");
		label_1_1_1_2.setFont(new Font("SansSerif", Font.BOLD, 22));
		label_1_1_1_2.setAlignment(Label.CENTER);
		label_1_1_1_2.setBounds(423, 80, 198, 50);
		contentPane.add(label_1_1_1_2);
		
		Button button_1 = new Button("Giriş Yap");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KullaniciGiris giris = new KullaniciGiris();
				giris.setVisible(true);
				dispose();
			}
		});
		button_1.setBackground(Color.GRAY);
		button_1.setBounds(469, 136, 96, 35);
		contentPane.add(button_1);
		
		JTextPane txtpnDnyannBirNumaral = new JTextPane();
		txtpnDnyannBirNumaral.setText("Dünyanın Bir Numaralı \"Banka Uygulamasına\" Hoşgeldiniz.");
		txtpnDnyannBirNumaral.setFont(new Font("SansSerif", Font.BOLD, 14));
		txtpnDnyannBirNumaral.setEditable(false);
		txtpnDnyannBirNumaral.setBounds(448, 194, 184, 135);
		contentPane.add(txtpnDnyannBirNumaral);
		
		Button button = new Button("Oluştur");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kutuKontrol(textField_Ad.getText(), textField_Soyad.getText(), textField_TC.getText(), passwordField.getText(), textField_Dogum.getText(),
						textField_Tel.getText(),textField_Adres.getText(), lblNewLabel_ad, lblNewLabel_soy, lblNewLabel_tc, lblNewLabel_sifre, lblNewLabel_dog, 
						lblNewLabel_tel, lblNewLabel_adres);
				jsonVeriEkle(textField_Ad.getText(), textField_Soyad.getText(), textField_TC.getText(), passwordField.getText(), textField_Dogum.getText(),
						textField_Tel.getText(),textField_Adres.getText());
			}
		});
		button.setFont(new Font("SansSerif", Font.BOLD, 16));
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(154, 401, 126, 40);
		contentPane.add(button);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else 
					passwordField.setEchoChar('*');		
			}
		});
		checkBox.setBackground(new Color(255, 255, 255));
		checkBox.setBounds(374, 360, 26, 23);
		contentPane.add(checkBox);
		
		
	}
	public void jsonVeriEkle(String lbl_ad,String lbl_soyad, String lbl_tc, String lbl_sifre ,String lbl_dog,String lbl_tel,String lbl_adres) {
		if(!lbl_ad.isEmpty() && !lbl_soyad.isEmpty() && !lbl_tc.isEmpty() && !lbl_sifre.isEmpty() && !lbl_dog.isEmpty()
				&& !lbl_tel.isEmpty() && !lbl_adres.isEmpty()) {
			 try {
		            // JSON dosyasını oku
		            String jsonString = new String(Files.readAllBytes(Paths.get(JSON_FILE_PATH)));
		            JSONArray jsonArray;

		            // Eğer JSON dosyası boşsa yeni bir JSONArray oluştur
		            if (jsonString.trim().isEmpty()) {
		                jsonArray = new JSONArray();
		            } else {
		                // JSON dosyası boş değilse mevcut JSON dizisini kullan
		                jsonArray = new JSONArray(jsonString);
		            }

		            // Yeni kişiyi temsil eden bir JSONObject oluştur
		            JSONObject json = new JSONObject();
		            json.put("firstName", lbl_ad);
		            json.put("lastName", lbl_soyad);
		            json.put("sifre", lbl_sifre);
		            json.put("tcKimlik", lbl_tc);
		            json.put("telefonNumarasi", lbl_tel);                
		            json.put("dogumTarih", lbl_dog);
		            json.put("hesapNumarasi", rastgele16RakamliSayiOlustur());
		            json.put("adres", lbl_adres);
		            json.put("bakiye", 0.0);
		            json.put("kartEkstre", 0.0);
		            json.put("kartBorc", 0.0);

		            // JSON dizisine yeni kişiyi ekle
		            jsonArray.put(json);

		            // Güncellenmiş JSON dizisini dosyaya yaz
		            Files.write(Paths.get(JSON_FILE_PATH), jsonArray.toString().getBytes());
		            
		            JOptionPane.showMessageDialog(null, "Hesabınız oluşturuldu. Hoşgeldiniz :)");
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    } else {
		        JOptionPane.showMessageDialog(null, "Boşluk bırakmadan giriş yapınız.");
		    }
	}
	
	public static String rastgele16RakamliSayiOlustur() {
        Random random = new Random();
        StringBuilder sayi = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            int rastgeleRakam = random.nextInt(10);
            sayi.append(rastgeleRakam);
        }

        return sayi.toString();
    }
	public void kutuKontrol(String ad,String soyad, String tc, String sifre ,String dog,String tel,String adres,
			JLabel lbl_ad,JLabel lbl_soyad, JLabel lbl_tc, JLabel lbl_sifre ,JLabel lbl_dog,JLabel lbl_tel,JLabel lbl_adres) {		
		if(!ad.isEmpty()) {
			lbl_ad.setIcon(new ImageIcon(KullaniciKayit.class.getResource("/images/check-mark.png")));
		}
		else {
			lbl_ad.setIcon(new ImageIcon(KullaniciKayit.class.getResource("/images/close (1).png")));
		}
		if(!soyad.isEmpty()) {
			lbl_soyad.setIcon(new ImageIcon(KullaniciKayit.class.getResource("/images/check-mark.png")));
		}
		else {
			lbl_soyad.setIcon(new ImageIcon(KullaniciKayit.class.getResource("/images/close (1).png")));
		}
		if(!tc.isEmpty()) {
			lbl_tc.setIcon(new ImageIcon(KullaniciKayit.class.getResource("/images/check-mark.png")));
		}
		else {
			lbl_tc.setIcon(new ImageIcon(KullaniciKayit.class.getResource("/images/close (1).png")));
		}
		if(!sifre.isEmpty()) {
			lbl_sifre.setIcon(new ImageIcon(KullaniciKayit.class.getResource("/images/check-mark.png")));
		}
		else {
			lbl_sifre.setIcon(new ImageIcon(KullaniciKayit.class.getResource("/images/close (1).png")));
		}
		if(!dog.isEmpty()) {
			lbl_dog.setIcon(new ImageIcon(KullaniciKayit.class.getResource("/images/check-mark.png")));
		}
		else {
			lbl_dog.setIcon(new ImageIcon(KullaniciKayit.class.getResource("/images/close (1).png")));
		}
		
		if(!tel.isEmpty()) {
			lbl_tel.setIcon(new ImageIcon(KullaniciKayit.class.getResource("/images/check-mark.png")));
		}
		else {
			lbl_tel.setIcon(new ImageIcon(KullaniciKayit.class.getResource("/images/close (1).png")));
		}
		if(!adres.isEmpty()) {
			lbl_adres.setIcon(new ImageIcon(KullaniciKayit.class.getResource("/images/check-mark.png")));
		}
		else {
			lbl_adres.setIcon(new ImageIcon(KullaniciKayit.class.getResource("/images/close (1).png")));
		}
	}
}
