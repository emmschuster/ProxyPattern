import java.util.Scanner;

public class ProxyClass {
	private String name = "Emma";
	private int password = 6666;
	private int counter = 0;
	Scanner sc = new Scanner(System.in);

	public void checkPwdandUser(String n, int pwd) {
		int xx = pwd;
		String nn = n;
		System.out.println("hallo");

		if (password == xx && name.equals(nn)) {
			System.out.println("hallow2");
			tasks();
		} else {
			System.out.println("fucked");
		}

	}

	public void tasks() {
		System.out.println("Was willst du machen");

	}

}
