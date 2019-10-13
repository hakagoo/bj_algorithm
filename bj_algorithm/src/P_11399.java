import java.util.Arrays;
import java.util.Scanner;

public class P_11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int[] p = new int[n+1];
		int min = 0;
		
		if(n >= 1) {
			p[1] = arr[1];
			min = p[1];
			for(int i = 2; i <= n; i++) {
				p[i] = p[i-1] + arr[i];
				min += p[i];
			}
		}
		
		System.out.println(min);
		
	}
}
