import java.util.Scanner;

public class P_4948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			
			int count = 0;
			for(int i = n+1; i <= 2*n; i++) {
				if(isPrimeNumber(i)) {
					count++;
				}
			}
			
			result += count+"\n";
		}
		System.out.println(result);
	}
	
	public static boolean isPrimeNumber(int n) {
		int end = (int)Math.sqrt(n);
		for(int i = 2; i <= end; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
