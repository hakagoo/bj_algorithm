import java.util.ArrayList;
import java.util.Scanner;

public class P_2606 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int n = sc.nextInt();
		boolean[] v = new boolean[c+1];
		v[1] = true;
		ArrayList<Integer>[] node = new ArrayList[c+1];
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			node[c1].add(c2);
			node[c2].add(c1);
		}
		
		for(int i = 1; i <= n; i++) {
			if(v[i]) {
				for(int j = 0; j < node[i].size(); j++) {
					if(!v[node[i].get(j)]) {						
						v[node[i].get(j)] = true;
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
		
	}
}
