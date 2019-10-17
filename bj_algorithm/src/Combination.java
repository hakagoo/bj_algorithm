import java.util.ArrayList;
import java.util.Scanner;

public class Combination {
	
	/*
	 * n과 r이 주어졌을때,
	 * 1부터 n까지 r개를 선택하는 모든 경우의 수를 출력
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i++) {
			nums[i] = i+1;
		}
		ArrayList<Integer> list = new ArrayList<>();
		combination(n, r, 1, list);
	}
	
	public static void combination(int n, int r, int i, ArrayList<Integer> list) {
		
		if(r == 0) {
				System.out.print("[");
			for(int l = 0; l < list.size(); l++) {
				System.out.print(list.get(l) + ((l == list.size()-1) ? "]\n" : ", "));
			}
			return;
		} else if (n == i-1) {
			return;
		} else {
			list.add(i);
			combination(n, r-1, i+1, list);
			list.remove(list.size()-1);
			combination(n, r, i+1,list);
		}
	}
}
