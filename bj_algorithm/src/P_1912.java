import java.util.Scanner;

public class P_1912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int max = dp[1];
		for(int i = 1; i <= n; i++) {
			if(dp[i-1] + arr[i] > arr[i]) {
				dp[i] = dp[i-1] + arr[i];
			} else {
				dp[i] = arr[i];
			}
			
		}
		
		for(int i = 1; i <= n; i++) {
			if(max < dp[i]) {
				max = dp[i];
			}
		}
		
		System.out.println(max);

	}
}
