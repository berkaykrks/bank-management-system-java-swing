# bank-management-system-java-swing

Proje Tanımı
Bu proje, Java Swing kullanılarak geliştirilmiş bir Banka Yönetim Sistemi'ni içermektedir. Sistem, kullanıcıların hesaplarını yönetmelerine, bakiye sorgulamalarına, kredi ödemelerine, para çekme ve yatırma işlemlerine, ve transfer işlemlerine olanak tanır.

Proje Yapısı
Projede aşağıdaki sınıflar kullanılmaktadır:

KimlikVeri: Kullanıcı kimlik bilgilerini tutan sınıf.
KullaniciVerileri: Kullanıcı işlemlerini ve bilgilerini yöneten sınıf.
BakiyeOgren: Hesap bakiyesini sorgulayan sınıf.
KrediOdeme: Kredi ödeme işlemlerini gerçekleştiren sınıf.
ParaCek: Para çekme işlemlerini gerçekleştiren sınıf.
ParaYatir: Para yatırma işlemlerini gerçekleştiren sınıf.
TransferYap: Hesaplar arası para transferini gerçekleştiren sınıf.
KullaniciGiris: Kullanıcı giriş işlemlerini yöneten sınıf.
KullaniciIslemleri: Kullanıcının gerçekleştirebileceği işlemleri yöneten sınıf.
KullaniciKayit: Yeni kullanıcı kayıtlarını oluşturan sınıf.
Kullanım Senaryoları
Proje, aşağıdaki temel kullanım senaryolarını desteklemektedir:

Kullanıcı Girişi: Kullanıcılar sisteme giriş yapabilir ve kimlik bilgilerini kullanarak hesaplarına erişebilirler.
Bakiye Sorgulama: Kullanıcılar hesap bakiyelerini sorgulayabilirler.
Kredi Ödeme: Kullanıcılar kredi borçlarını ödeyebilirler.
Para Çekme ve Yatırma: Kullanıcılar ATM işlemleri gibi para çekme ve yatırma işlemleri gerçekleştirebilirler.
Hesaplar Arası Transfer: Kullanıcılar kendi hesapları arasında veya başka bir kullanıcının hesabına para transferi yapabilirler.
Yeni Kullanıcı Kaydı: Yeni kullanıcılar sisteme kaydolabilirler.
Veri Saklama
Proje, kullanıcı giriş bilgileri ve gerçekleştirilen işlemlere ait verileri "veri.json" adlı bir dosyada saklamaktadır. Bu dosya, JSON formatında veri tutar ve program her çalıştığında bu dosyadan verileri yükler ve günceller.

Başlangıç
Proje çalıştırıldığında, kullanıcılara giriş yapma veya yeni bir hesap oluşturma seçenekleri sunulur. Giriş yapıldıktan sonra, kullanıcılar menüden farklı işlemleri seçebilirler.
![bnk1](https://github.com/wayolapre/bank-management-system-java-swing/assets/116452877/21412608-a58d-4362-9dbd-058606ab7f04)
![bnk2](https://github.com/wayolapre/bank-management-system-java-swing/assets/116452877/25f639b6-76d1-40f5-90c0-6c50e91e0705)

