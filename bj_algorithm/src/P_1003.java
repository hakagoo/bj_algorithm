import java.util.Scanner;

public class P_1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		
		String result = "";
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(sc.nextLine());
			result += fibo(n) + " " + fibo(n+1) + "\n";
		}
		
		System.out.println(result);
	}
	
	public static int fibo(int n) {
		int a = 1;
		int b = 0;
		int c = a+b;
		
		if(n == 0) return a;
		else if(n == 1) return b;
		else {
			for(int i = 1; i <= n; i++) {
				a = b;
				b = c;
				c = a + b;
			}
			return a;
		}
		
	}
}
