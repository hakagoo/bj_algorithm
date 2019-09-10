import java.util.Scanner;

public class P_1244 {

	static int[] sw;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		sw = new int[n+1];
		for(int i = 1; i <= n; i++) {
			sw[i] = sc.nextInt();
		}
		sc.nextLine();
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
		for (int i = 1; i <= n; i++) {
	        System.out.print(sw[i] + " ");
	        if (i % 20 == 0) {
	            System.out.println();
	        }
	    }
	}

	static boolean girlCheck(int number, int flag) {
		if (number - flag >= 1 && number + flag <= sw.length-1) {
			if (sw[number - flag]==(sw[number + flag])) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	static void girl(int number) {
		int flag = 0;
		int min = number;
		int max = number;

		while (true) {
			if (girlCheck(number, flag)) {
				min = number - flag;
				max = number + flag;
				flag++;
			} else {
				break;
			}
		}

		for (int i = min; i <= max; i++) {
			change(i);
		}

	}

	static void boy(int number) {
		for (int i = 1; i <= sw.length-1; i++) {
			if (i % number == 0) {
				change(i);
			}
		}
	}

	static void change(int number) {
		if (sw[number]==1) {
			sw[number] = 0;
		} else if (sw[number]==0) {
			sw[number] = 1;
		}
	}

}
