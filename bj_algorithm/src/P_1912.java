import java.util.Arrays;
import java.util.Scanner;

public class P_1912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] maxArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-count; j++) {
				int tmp = 0;
				for(int k = 0; k < count; k++) {
					tmp += arr[j+k];
				}
				if(j == 0 || tmp > maxArr[j]) {
					maxArr[j] = tmp; 
				}
			}
			count++;
		}
		Arrays.sort(maxArr);
		System.out.println(maxArr[n-1]);
	}
}
