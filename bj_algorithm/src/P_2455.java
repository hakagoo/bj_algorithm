import java.util.Scanner;

public class P_2455 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		int x = sc.nextInt();
		int y = sc.nextInt();
		arr[0] = x + y;
		
		for(int i = 1; i < 4; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sc.nextLine();
			arr[i] = arr[i-1] - a + b;
		}
		
		int max = arr[0];
		for(int i = 1; i < 4; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
	}
}
