import java.util.Arrays;
import java.util.Scanner;

public class P_2997 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		Arrays.sort(arr);
		
		int x = arr[1] - arr[0];
		int y = arr[2] - arr[1];
		
		if(x == y) {
			System.out.println(arr[2] + x);
		} else if (x > y) {
			System.out.println(arr[0] + y);
		} else {
			System.out.println(arr[1] + x);
		}
		
	}
}
