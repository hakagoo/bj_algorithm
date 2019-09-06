import java.util.Arrays;
import java.util.Scanner;

public class P_2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] height = new int[9];
		int heightSum = 0;
		
		
		
		for (int i = 0; i < 9; i++) {
			height[i] = Integer.parseInt(sc.nextLine());
			heightSum += height[i];
		}
		
		a:for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(i == j) continue;
				if(heightSum - height[i] - height[j] == 100) {
					height[i] = -1;
					height[j] = -1;
					break a;
				}
			}
		}
		
		Arrays.sort(height);
		
		for(int i = 2; i < 9; i++) {
			System.out.println(height[i]);
		}


	}
}
