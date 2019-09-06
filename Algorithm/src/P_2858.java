import java.util.Scanner;

public class P_2858 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");

		int r = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		for (int l = 1; l < r+b; l++) {
			int w;
			if (b % l == 0) {
				w = b / l;
				if (r == (l * 2) + (w * 2) + 4) {
					System.out.println((w + 2) + " " + (l + 2));
					break;
				}
			}
		}
	}
}
