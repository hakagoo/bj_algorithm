import java.util.Scanner;

public class P_2960 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] deleted = new int[1001];
		boolean[] isPrime = new boolean[1001];
		
		for(int i = 0; i < isPrime.length; i++) {
			isPrime[i] = true;
		}
		
		int next = 1;
		for(int i = 2; i <= n; i++) {
			for(int j = i; j <= n; j+=i) {
				if(!isPrime[j]) {
					continue;
				}
				isPrime[j] = false;
				deleted[next++] = j;
			}
		}
		System.out.println(deleted[k]);
	}
}
