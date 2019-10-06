import java.util.Scanner;

public class P_3034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int w = Integer.parseInt(input[1]);
		int h = Integer.parseInt(input[2]);
		
		double max = Math.sqrt((w*w) + (h*h));
		String result = "";
		
		for(int i = 0; i < n; i++) {
			int length = Integer.parseInt(sc.nextLine());
			if(length <= max) {
				result += "DA\n";
			} else {
				result += "NE\n";
			}
		}
		
		System.out.println(result);
	}
}
