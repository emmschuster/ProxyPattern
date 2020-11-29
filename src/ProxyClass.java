import java.util.Scanner;

public class ProxyClass implements Bankkonto {
	private String name;
	private int password;
	private int id;
	private float kStand;
	Bankkonto B;
//	Bankkonto Emma;
	Scanner sc = new Scanner(System.in);

	public ProxyClass(String n, int p, int nr, float stand) {
		this.name = n;
		this.password = p;
		this.id = nr;
		this.kStand = stand;
		this.B = new Konto(name, id, kStand);
	}

//	public ProxyClass(String n, int p) {
//		this.name=n;
//		this.password=p;
//		this.id = 12;
//		this.kStand=2000;
//		this.Emma = new Konto(name, password, id, kStand);
//	}

//	public void checkPwdandUser(String n, int pwd) {
//		int xx = pwd;
//		String nn = n;
//		if (password == xx && name.equals(nn)) {
//			tasks();
//		} else {
//			System.out.println("fucked");
//		}
//	}

	public void tasks() {
		int task, money;
		System.out.println("Was willst du machen");
		System.out.println("Geld abheben ... 1\nGeld einzahlen ... 2\nKontostand ansehen ... 3");
		task = sc.nextInt();
		switch (task) {
		case 1:
			System.out.println("Wie viel willst du einzaheln?");
			money = sc.nextInt();
			kStand += money;
			System.out.println("Jetzt hast du" + getKontotand());
			break;
		case 2:
			System.out.println("Wie viel willst du abheben?");
			money = sc.nextInt();
			kStand -= money;
			System.out.println("Jetzt hast du" + getKontotand());
			break;
		case 3:
			System.out.println("Dein Kontostand: ");
			System.out.println(getKontotand());
			break;
		default:
			System.out.println("Nicht vorhanden");
		}
	}

	@Override
	public float getKontotand() {
		if (checkpassw() == true) {
			return B.getKontotand();
		}
		return 0;
	}

	private boolean checkpassw() {
		boolean check = false;
		int s=0;
		System.out.println("Passwort: ");
		try {
			s = sc.nextInt();
		} catch (Exception e) {
			System.out.print("Fehlerhafte Eingabe und somit ");
		}
		if (this.password == s) {
			System.out.println("richtig");
			check = true;
		} else {
			System.out.println("falsches passwort");
		}
		return check;
	}

	@Override
	public void setKontotand(float x) {
		if (checkpassw() == true) {
			B.setKontotand(x);
		}
	}

	@Override
	public String getName() {
		return B.getName();
	}

	@Override
	public void setName(String s) {
		B.setName(s);

	}

	@Override
	public float getKontonummer() {
		return B.getKontonummer();
	}

	@Override
	public void setKontonummer(int x) {
		B.setKontonummer(x);
	}

	@Override
	public void transferMoney(float f) {
		if (checkpassw() == true) {
			B.setKontotand(f);
		}
	}
}
