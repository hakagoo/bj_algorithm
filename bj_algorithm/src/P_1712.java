import java.util.Scanner;

public class P_1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = 0;
		
		if(c-b <= 0) {
			x = -1;
		} else {
			x = a / (c-b) + 1;
		}
		
		System.out.println(x);
		
	}
}
