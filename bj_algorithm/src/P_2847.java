import java.util.Scanner;

public class P_2847 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		int count = 0;
		for(int i = n-1; i > 0; i--) {
			while(arr[i] <= arr[i-1]) {
				arr[i-1]--;
				count++;
			}
		}
		System.out.println(count);
	}
}
