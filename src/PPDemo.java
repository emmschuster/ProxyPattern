import java.util.Scanner;

public class PPDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin = 0;
		String name = null;
		ProxyClass p = new ProxyClass();
		// p.benutzerErstellen();
		try {
			System.out.println("Willkommen bei der Bank");
			System.out.println("Bitte gib deinen Namen ein:");
			name = sc.next();
			System.out.println("Bitte gib deinen 4-stelligen PIN ein:");
			pin = sc.nextInt();
			p.checkPwdandUser(name, pin);
		} catch (Exception e) {
			System.out.println("Fehlerhafte Eingabe!!");
		}
	}
}
