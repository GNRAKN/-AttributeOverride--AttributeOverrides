package telefon;

import javax.persistence.Embeddable;

@Embeddable
public class Telefon {

	private String telefon_no;
	private String telefon_durum;

	public String getTelefon_no() {
		return telefon_no;
	}

	public void setTelefon_no(String telefon_no) {
		this.telefon_no = telefon_no;
	}

	public String getTelefon_durum() {
		return telefon_durum;
	}

	public void setTelefon_durum(String telefon_durum) {
		this.telefon_durum = telefon_durum;
	}

	
	
	
	
	
	
}
