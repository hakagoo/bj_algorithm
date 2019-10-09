import java.util.Scanner;

public class P_1003 {
	
	static int[] arr = new int[2];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		String result = "";
		
		for(int i = 0; i < t; i++) {
			arr[0] = 0;
			arr[1] = 0;
			int n = Integer.parseInt(sc.nextLine());
			fibo(n);
			result += arr[0] + " " + arr[1] + "\n";
		}
		System.out.println(result);
	}
	
	public static int fibo(int n) {
		if(n == 0) {
			arr[0]++;
			return 0;
		} else if(n == 1) {
			arr[1]++;
			return 1;
		} else {
			return fibo(n-1) + fibo(n-2);
		}
	}
}
