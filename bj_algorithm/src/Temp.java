import java.util.Arrays;
import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String N = String.valueOf(n);
		char[] arr = N.toCharArray();
		Arrays.sort(arr);
		String result = "";
		long answer = 0;
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		answer = Long.valueOf(result);
		
	}
}
