

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P_1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String[] neverHeard = new String[n];
		Set<String> result = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			neverHeard[i] = br.readLine();
		}
		Arrays.sort(neverHeard); 
		
		for(int i = 0; i < m; i++) {
			String neverSeen = br.readLine();
			int num = Arrays.binarySearch(neverHeard, neverSeen);
			if(num >= 0) {
				result.add(neverSeen);
			}
		}
		br.close();
		
		Object[] obj = result.toArray();
		Arrays.sort(obj);

		
		System.out.println(result.size());
		for(Object o : obj) {
			System.out.println(String.valueOf(o));
		}
	}
}
