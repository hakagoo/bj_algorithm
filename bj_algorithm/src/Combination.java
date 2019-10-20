import java.util.ArrayList;
import java.util.Scanner;

public class Combination {
	
	/*
	 * n과 r이 주어졌을때,
	 * 1부터 n까지 r개를 선택하는 모든 경우의 수를 출력
	 * 
	 */
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int[] arr = new int[r];
		ArrayList<Integer> list = new ArrayList<>();	
		combination(n, r, 1, list);
		combinationCount2(n, r);
		System.out.println(count);
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
			combination(n, r, i+1, list);
		}
	}
	
	public static int combinationCount(int n, int r) {
		if(r == 0 || r == n) {
			return 1;
		} else {
			return combinationCount(n-1, r) + combinationCount(n-1, r-1);
		}
		
	}
	
public static void combinationCount2(int n, int r) {
		if(r == 0) {
			count++;
			return;
		} else if (n == r) {
			return;
		} else {
			combinationCount2(n-1, r-1);
			combinationCount2(n-1, r);
		}
	}
	
}
