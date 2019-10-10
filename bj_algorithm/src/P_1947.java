import java.util.Scanner;

public class P_1947 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] dp = new long[n+1];
		int a = 1000000000;
		
		if(n == 1) dp[1] = 0;
		if(n >= 2) dp[2] = 1;
		for(int i = 3; i <= n; i++) {
			dp[i] = ((dp[i-1] + dp[i-2]) % a) * (i-1) % a;
		}
		System.out.println(dp[n]);
	}
}
