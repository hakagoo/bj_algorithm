import java.util.Scanner;

public class P_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		int[] c = new int[n];
		
		for(int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		int max = 0;
		int tmp = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int k = j+1; k < n; k++) {
					tmp = c[i] + c[j] + c[k];
					if(tmp > max && tmp <= m) {
						max = tmp;
					}
				}
			}
		}
		
		System.out.println(max);
		
	}
}
