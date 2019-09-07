import java.util.Scanner;

public class P_2979 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1])*2;
		int c = Integer.parseInt(str[2])*3;
		
		int[] time = new int[101];
		
		for(int i = 0; i < 3; i++) {
			String[] tmp = sc.nextLine().split(" ");
			int s = Integer.parseInt(tmp[0]);
			int e = Integer.parseInt(tmp[1]);
			
			for(int j = s; j < e; j++) {
				time[j]++;
			}
		}
		
		int result = 0;

		for(int i = 0; i < 101; i++) {
			switch (time[i]) {
			case 1:
				result += a;
				break;
			case 2:
				result += b;
				break;
			case 3:
				result += c;
				break;
			default:
				break;
			}
		}
		System.out.println(result);
	}
}
