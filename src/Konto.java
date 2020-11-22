import java.time.LocalDate;

public class Konto {
	private String name;
	private float kontonummer;
	private float kontostand;
	private LocalDate birthdate = LocalDate.now(); 
	//birthdate = LocalDate.of(2017, 1, 13);  
	
	public float getKontostand() {
		return kontostand;
	}
	public void setKontostand(float kontostand) {
		this.kontostand = kontostand;
	}	
}
