
import java.util.*;

public class P_8979 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][5];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        Arrays.sort(arr, new Comparator<int[]>() {
           @Override
            public int compare(int[] o1, int[] o2){
                return o2[3] - o1[3];
            }
        });
        
        Arrays.sort(arr, new Comparator<int[]>() {
           @Override
            public int compare(int[] o1, int[] o2){
                return o2[2] - o1[2];
            }
        });
        
        Arrays.sort(arr, new Comparator<int[]>() {
           @Override
            public int compare(int[] o1, int[] o2){
                return o2[1] - o1[1];
            }
        });
        
        arr[0][4] = 1;
        for(int i = 1; i < n; i++){
            int g = arr[i-1][1];
            int s = arr[i-1][2];
            int b = arr[i-1][3];
            if(arr[i][1] != g || arr[i][2] != s || arr[i][3] != b){
                arr[i][4] = i+1;
            } else {
                arr[i][4] = arr[i-1][4];
            }
        }
        
        for(int i = 0; i < n; i++){
            if(arr[i][0] == k){
                System.out.println(arr[i][4]);
            }
        }
    }
}
