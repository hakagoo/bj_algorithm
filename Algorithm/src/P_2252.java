import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P_2252 {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>(); 
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		LinkedList<Integer>[] vertexArr = new LinkedList[n+1];
		for(int i = 1; i <= n; i++) {
			vertexArr[i] = new LinkedList<Integer>();
		}
		int[] indegree = new int[n+1];
		
		for(int i = 0; i < m; i++) {
			int v = sc.nextInt();
			int w = sc.nextInt();
			vertexArr[v].add(w);
			indegree[w]++;
		}
		
		for(int i = 1; i <= n; i++) {
			if(indegree[i] == 0) {
				q.offer(i);
			}
		}
		
		while(!q.isEmpty()) {
			int x = q.poll();
			System.out.print(x + " ");
			for(int y : vertexArr[x]) {
				indegree[y]--;
				if(indegree[y] == 0) {
					q.offer(y);
				}
			}
			
		}
	}
}
