import java.util.Scanner;

public class P_10545 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		StringBuffer sb = new StringBuffer();
		String[] pad = {"", 
						"", "abc", "def",
						"ghi", "jkl", "mno",
						"pqrs", "tuv", "wxyz"};
		nums[0] = 0;
		for(int i = 1; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		sc.nextLine();
		char[] input = sc.nextLine().toCharArray();
		
		for(int i = 0; i < input.length; i++) {
			for(int j = 1; j < pad.length; j++) {
				for(int k = 0; k < pad[j].length(); k++) {
					if(input[i] == pad[j].charAt(k)) {
						if(i >= 1 && pad[j].contains(String.valueOf(input[i-1]))) {
							sb.append("#");
						}
						int tmp = 0;
						for(int l = 1; l < nums.length; l++) {
							if(nums[l] == j) {
								tmp = l;
							}
						}
						for(int l = 0; l <= k; l++) {
							sb.append(tmp);
						}
					}
				}
			}
		}
		System.out.println(sb.toString());
	}
}
