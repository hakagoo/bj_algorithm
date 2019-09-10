import java.util.Scanner;

public class P_1244 {

	static String[] sw;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		sw = sc.nextLine().split(" ");
		int student = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < student; i++) {
			String[] str = sc.nextLine().split(" ");
			int gender = Integer.parseInt(str[0]);
			int number = Integer.parseInt(str[1]);

			switch (gender) {
			case 1:
				boy(number);
				break;
			case 2:
				girl(number);
				break;
			default:
				break;
			}
		}
		for (int i = 0; i < sw.length; i++) {
			System.out.print(((i+1)%20==0 || (i+1)==sw.length)? sw[i] : sw[i] + " ");
			if (i % 19 == 0 && i > 0) {
				System.out.println();
			}
		}
	}

	static boolean girlCheck(int i, int flag) {
		if (i - flag >= 0 && i + flag < sw.length) {
			if (sw[i - flag].equals(sw[i + flag])) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	static void girl(int number) {
		int i = number - 1;
		int flag = 0;
		int min = i;
		int max = i;

		while (true) {
			if (girlCheck(i, flag)) {
				min = i - flag;
				max = i + flag;
				flag++;
			} else {
				break;
			}
		}

		for (int j = min; j <= max; j++) {
			change(j);
		}

	}

	static void boy(int number) {
		for (int i = 0; i < sw.length; i++) {
			if ((i + 1) % number == 0) {
				change(i);
			}
		}
	}

	static void change(int i) {
		if (sw[i].equals("1")) {
			sw[i] = "0";
		} else if (sw[i].equals("0")) {
			sw[i] = "1";
		}
	}

}
