import java.util.Scanner;

public class P_1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 0;
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		for(int i = 0; i < x-1; i++) {
			sum += month[i];
		}
		sum += y;
		
		System.out.println(day[sum%7]);
	}
}
