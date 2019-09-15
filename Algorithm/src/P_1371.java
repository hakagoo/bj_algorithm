import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P_1371 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String tmp = null;
		int[] alpha = new int[26];
		
		while((tmp = br.readLine()) != null) {
			tmp = tmp.replaceAll(" ", "");
			char[] arr = tmp.toCharArray();
			for(int i = 0; i < arr.length; i++) {
				alpha[arr[i] - 'a']++;
			}
		}
		
		int max = 0;
		for(int i = 0; i < 26; i++) {
			if(max < alpha[i]) {
				max = alpha[i];
			}
		}
		
		for(int i = 0; i < 26; i++) {
			if(max == alpha[i]) {
				bw.write( i + 'a');
			}
		}
		bw.flush();
	}
}
