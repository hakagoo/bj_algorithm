import java.util.Arrays;
import java.util.Scanner;

public class P_11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int[] p = new int[n];
		int min = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i+1; j++) {
				p[i] += arr[j];
			}
			min += p[i];
		}
		
		System.out.println(min);
		
	}
}
