import java.util.Scanner;

public class PPDemo {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int pin = 0, id=0;
//		float kStand=0 ;
//		String name = null;
//		ProxyClass p;
//		try {
//			System.out.println("Willkommen bei der Bank");
//			System.out.println("Bitte gib deinen Namen ein:");
//			name = sc.next();
//			System.out.println("Bitte gib deinen 4-stelligen PIN ein:");
//			pin = sc.nextInt();
//			System.out.println("Bitte gib deine ID ein:");
//			id = sc.nextInt();
//			System.out.println("Bitte gib deinen Kontostand ein:");
//			kStand = sc.nextFloat();
//		} catch (Exception e) {
//			System.out.println("Fehlerhafte Eingabe!!");
//			System.exit(0);
//		}
//		sc.close();
		ProxyClass p = new ProxyClass("Emma", 6666, 1234, 10000);
		
		System.out.println("Kontostand vorher :"+p.getKontotand());
		System.out.println("Einzahlen von 500€"); p.setKontotand(500);
		System.out.println("Kontostand nachher :"+p.getKontotand());
		
		System.out.println("Kontostand vorher :"+p.getKontotand());
		System.out.println("Auszahlen von 250€"); p.setKontotand(-250);
		System.out.println("Kontostand nachher :"+p.getKontotand());
	}
}
