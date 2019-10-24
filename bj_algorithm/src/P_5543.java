import java.util.Scanner;

public class P_5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] menu = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			menu[i] = sc.nextInt();
		}
		
		sum = Math.min(menu[0], Math.min(menu[1], menu[2]));
		sum += Math.min(menu[3], menu[4]);
		sum -= 50;
		System.out.println(sum);
		
	}
}
