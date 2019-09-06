import java.util.Scanner;

public class P_8958 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String sTestCase = sc.nextLine();
		int testCase = Integer.parseInt(sTestCase);
		int[] scores = new int[testCase];

			
		for(int i = 0; i < testCase; i++) {
			String sOX = sc.nextLine();
			String[] OX = sOX.split("");
			int score = 0;
			int sum = 0;

			for (int j = 0; j < OX.length; j++) {
				if (OX[j].equalsIgnoreCase("X")) {
					score = 0;
				} else {
					score++;
				}
				sum += score;
			}

			scores[i] = sum;
			
		}
		
		
		for(int s : scores) {
			System.out.println(s);
		}

	}
}