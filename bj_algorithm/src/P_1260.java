import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P_1260 {
	
	static boolean visited[];
	static ArrayList<Integer>[] adj;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		
		int n = Integer.parseInt(str[0]); //정점
		int m = Integer.parseInt(str[1]); //간선
		int v = Integer.parseInt(str[2]); //탐색 시작할 정점번호
		
		adj = (ArrayList<Integer>[])new ArrayList[n+1];
		
		for(int i = 1; i <= m; i++) {
			adj[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			String[] input = sc.nextLine().split(" ");
			int nodeNum1 = Integer.parseInt(input[0]);
			int nodeNum2 = Integer.parseInt(input[1]);
			adj[nodeNum1].add(nodeNum2);
			adj[nodeNum2].add(nodeNum1);
		}
		
	}
}
