import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class P_1260 {
	
	static boolean visited[];
	static ArrayList<Integer>[] adj;
	static Queue<Integer> queue;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		
		int n = Integer.parseInt(str[0]); //정점
		int m = Integer.parseInt(str[1]); //간선
		int v = Integer.parseInt(str[2]); //탐색 시작할 정점번호
		
		adj = (ArrayList<Integer>[])new ArrayList[n+1];
		
		for(int i = 1; i <= n; i++) {
			adj[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			String[] input = sc.nextLine().split(" ");
			int nodeNum1 = Integer.parseInt(input[0]);
			int nodeNum2 = Integer.parseInt(input[1]);
			adj[nodeNum1].add(nodeNum2);
			adj[nodeNum2].add(nodeNum1);
		}
		
		for(int i = 1; i <= n; i++) {
			Collections.sort(adj[i]);
		}
		
		visited = new boolean[n+1];
		queue = new LinkedList<>();
		
		DFS(v);
		System.out.println();
		reset(n);
		BFS(v);
		
	}
	
	public static void DFS(int v) {
		visited[v] = true;
		System.out.print(v + " ");
		for(int a : adj[v]) {
			if(!visited[a]) {
				DFS(a);
			}
		}
	}
	
	public static void BFS(int v) {
		queue.offer(v);
		visited[v] = true;
		
		while(!queue.isEmpty()) {
			int nodeNum = queue.poll();
			System.out.print(nodeNum + " ");
			for(int a : adj[nodeNum]) {
				if(!visited[a]) {
					visited[a] = true;
					queue.add(a);
				}
			}
		}
		
	}
	
	public static void reset(int n) {
		for(int i = 1; i <= n; i++) {
			visited[i] = false;
		}
	}
	
}
