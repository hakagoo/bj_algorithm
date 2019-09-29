
import java.util.Scanner;

public class P_2897 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();
		sc.nextLine();

		char[][] parking = new char[r][c];
		int[] result = new int[5];

		for (int i = 0; i < r; i++) {
			String str = sc.nextLine();
			parking[i] = str.toCharArray();
		} // 입력

		// 로직
		for (int i = 0; i < r - 1; i++) {
			for (int j = 0; j < c - 1; j++) {
				int comma = commaCounter(i, j, parking);
				int x = xCounter(i, j, parking);
				if (comma + x == 4) {
					switch (x) {
					case 0:
						result[x]++;
						break;
					case 1:
						result[x]++;
						break;
					case 2:
						result[x]++;
						break;
					case 3:
						result[x]++;
						break;
					case 4:
						result[x]++;
						break;
					default:
						break;
					}
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(result[i]);
		} // 출력

	}

	public static int commaCounter(int r, int c, char[][] parking) {
		int count = 0;
		for (int i = r; i < r + 2; i++) {
			for (int j = c; j < c + 2; j++) {
				if (parking[i][j] == '.') {
					count++;
				}
			}
		}
		return count;
	}

	public static int xCounter(int r, int c, char[][] parking) {
		int count = 0;
		for (int i = r; i < r + 2; i++) {
			for (int j = c; j < c + 2; j++) {
				if (parking[i][j] == 'X') {
					count++;
				}
			}
		}
		return count;
	}
}
