
import java.util.*;

public class P_2563 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] arr = new boolean[101][101];
        
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = y; j < y+10; j++){
                for(int k = x; k < x+10; k++){
                    if(!arr[j][k]){
                        arr[j][k] = true;
                    }
                }
            }
        }
        
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j]){
                    count++;
                }
            }
        }
        
        System.out.println(count);
        
    }
}
