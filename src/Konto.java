//import java.time.LocalDate;

public class Konto implements Bankkonto{
	private String name;
	private int kontonummer;
	private float kontostand;
	//private LocalDate birthdate = LocalDate.now(); 
	//birthdate = LocalDate.of(2017, 1, 13);  
	
	public Konto(String n, int kn, float ks) {
		this.kontostand=ks;
		this.kontonummer=kn;
		this.name=n;
		setKontotand(kontostand);
		setName(name);
		setKontonummer(kontonummer);
	}
	@Override
	public float getKontotand() {
		return this.kontostand;
	}
	@Override
	public void setKontotand(float x) {
		this.kontostand=x;
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public void setName(String s) {
		this.name=s;
	}
	@Override
	public float getKontonummer() {
		return this.kontonummer;
	}
	@Override
	public void setKontonummer(int x) {
		this.kontonummer=x;
	}
	@Override
	public void transferMoney(float f) {
		if (f>0) {
			this.kontostand=this.kontostand+f;
		} else System.out.println("Error!!!");;
	}
	
	
}
