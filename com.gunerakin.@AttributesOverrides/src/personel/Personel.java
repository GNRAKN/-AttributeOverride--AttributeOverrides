package personel;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import telefon.Telefon;


@Entity
@Table(name = "Personel") //VERITABANI TABLO ADI
public class Personel implements Serializable {
	private static final long serialVersionUID = 1L;

	

	// Bu bir pojo sınıfıdır.
	//ISTEGE GORE GET METOTLARI UZERINDE DE ANNOTATION LAR KULLANILABILIR. ANCAK KODUN BAKIMINI ZORLASTIRIR.

	
	@Id		
	@GeneratedValue 
	private int personel_id;
	private String personel_adi;
	private String personel_soyadi;
	

	@Embedded	
	@AttributeOverrides({ // Embeddable sınıfımıza ait iki adet varlık oluşturduk.Is ve Ev adresi diye. Bunları veritabanına kaydederken aynı isimde sütun olusmaya calısacak ve hata verecek. Bunun onune gecmek ıcın AttributeOverride kullanıyoruz.
		@AttributeOverride(name="telefon_no", column=@Column(name="CEP_TELEFONU")),
		@AttributeOverride(name="telefon_durum", column=@Column(name="CEP_TELEFON_DURUM"))
					   })
	private Telefon cep_telefonu;
	
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="telefon_no",column=@Column(name="Ev_Telefonu")),
	@AttributeOverride(name="telefon_durum", column=@Column(name="EV_TELEFON_DURUM"))
	   })
	private Telefon evTelefon;

	public int getPersonel_id() {
		return personel_id;
	}

	public void setPersonel_id(int personel_id) {
		this.personel_id = personel_id;
	}

	public String getPersonel_adi() {
		return personel_adi;
	}

	public void setPersonel_adi(String personel_adi) {
		this.personel_adi = personel_adi;
	}

	public String getPersonel_soyadi() {
		return personel_soyadi;
	}

	public void setPersonel_soyadi(String personel_soyadi) {
		this.personel_soyadi = personel_soyadi;
	}

	public Telefon getCepTelefon() {
		return cep_telefonu;
	}

	public void setCepTelefon(Telefon cep_telefonu) {
		this.cep_telefonu = cep_telefonu;
	}

	public Telefon getEvTelefon() {
		return evTelefon;
	}

	public void setEvTelefon(Telefon evTelefon) {
		this.evTelefon = evTelefon;
	}
	
}
