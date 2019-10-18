import java.util.Scanner;

public class P_1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] start = new int[n];
		int[] end = new int[n];
		
		for (int i = 0; i < n; i++) {
			start[i] = sc.nextInt();
			end[i] = sc.nextInt();
		}
		
		int min = 0;
		int max = 0;
		int minIndex = 0;
		int maxIndex = 0;
		int count = 0;
		
		for(int i = 0; i < n; i++){
			if(i == 0 || min > end[i]) {
				min = end[i];
				minIndex = i;
			}
			if(i == 0 || max < end[i]) {
				max = end[i];
				maxIndex = i;
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(start[i] < min) {
				start[i] = -1;
			}
		}



	}
}
