import java.util.Scanner;

public class P_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			System.out.println("TestCase #" + i);
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
	}
}
