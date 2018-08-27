package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import personel.Personel;
import telefon.Telefon;


public class Main {

	public static void main(String[] args) {

		Personel personel=new Personel();
		personel.setPersonel_adi("GNR");
		personel.setPersonel_soyadi("AKN");
		
		Telefon evTelefon=new Telefon();
		evTelefon.setTelefon_no("212-579-10-55");
		evTelefon.setTelefon_durum("PASIF");
		personel.setEvTelefon(evTelefon);
		
		Telefon cepTelefon=new Telefon();
		cepTelefon.setTelefon_no("538-123-45-78");
		cepTelefon.setTelefon_durum("AKTIF");
		personel.setCepTelefon(cepTelefon);
		
		
		// -----------------------------------------------
		// HIBERNATE KODLARI

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); // Bunlar
																								// oturumlarımız.
																								// Yapacağımız
																								// işlemlerde
																								// gerekli.

		Session session = sessionFactory.openSession(); // Oturumumuz basladi.
		session.beginTransaction(); // Transaction baslattik. Arasinda
									// yazdigimiz islemlerden herhangi birinde
									// sorun cikarsa islemi iptal edecek.

		session.save(personel); // nesnemizi veritabanına kaydediyoruz.
		
		session.getTransaction().commit();
		session.close();

		// -----------------------------------------------

	}

}
