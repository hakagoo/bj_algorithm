import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P_1516 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] time = new int[n+1]; 
		int[] indgree = new int[n+1];
		int[] result = new int[n+1];
		Queue<Integer> queue = new LinkedList<>();
		ArrayList<Integer>[] buildings = new ArrayList[n+1];
		for(int i = 1; i <= n; i++) {
			buildings[i] = new ArrayList<Integer>();
		}
		
		for(int i = 1; i <= n; i++) {
			time[i] = sc.nextInt();
			while(true) {
				int tmp = sc.nextInt();
				if(tmp == -1) {
					break;
				} else {
					indgree[i]++;
					buildings[tmp].add(i);
				}
			}
			//sc.nextLine();
		}
		
		for(int i = 1; i <= n; i++ ) {
			if(indgree[i] == 0) {
				queue.add(i);
				result[i] = time[i];
			}
		}
		
		while(!queue.isEmpty()) {
			int x = queue.poll();
			
			for(int y : buildings[x]) {
				indgree[y]--;
				result[y] = Math.max(result[y], result[x]+time[y]);
				if(indgree[y] == 0) {
					queue.add(y);
				}
			}
			
		}
		
		
		for(int i = 1; i <= n; i++) {
			System.out.println(result[i]);
		}
	}
	
	/*
	 * 
	 * 
	 *  5 --------- 건물의 종류 수
		10 -1 ----- 1번 건물 10초
		10 1 -1 --- 2번 건물 10초, 1번 건물(10)
		4 1 -1 ---- 3번 건물 4초, 1번 건물 (10)
		4 3 1 -1 -- 4번 건물 4초, 3번 건물(14), 1번 건물(10)
		3 3 -1 ---- 5번 건물 3초, 3번건물(14)
		
		10
		20
		14
		18
		17
	 * 
	 */
}
