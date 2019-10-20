import java.util.Scanner;

public class P_4963 {
	static int[][] map;
	static int w;
	static int h;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String result = "";
		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
				if (w == 0 && h == 0) break;
			
			map = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			int count = 0;

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 1) {
						count++;
						search(i, j);
					}
				}
			}
			result += count+"\n";

		}
		System.out.println(result);
	}

	public static void search(int w, int h) {
		int[] x = {-1, 0, 1, -1, 1, -1, 0, 1};
		int[] y = {-1, -1, -1, 0, 0, 1, 1, 1};
		map[w][h] = 0;
		for(int i = 0; i < 8; i++) {
			if(isRange(w+x[i], h+y[i]) && map[w+x[i]][h+y[i]] == 1) {
				search(w+x[i], h+y[i]);
			}
		}
		
	}

	public static boolean isRange(int w, int h) {
		if (w < 0 || h < 0 || w >= map.length || h >= map[w].length) {
			return false;
		} else {
			return true;
		}

	}
}
