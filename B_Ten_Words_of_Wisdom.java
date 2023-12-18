/**
 * B_Ten_Words_of_Wisdom
 */
import java.util.Scanner;
public class B_Ten_Words_of_Wisdom {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt();
            int max_quality = Integer.MIN_VALUE;
            int win = -1;
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = s.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    if(arr[i][0]<=10 && max_quality<arr[i][1]){ 
                        max_quality = arr[i][1];
                        win = i;
                    }
                }
            }
            System.out.println(win+1);
        }
        s.close();
    }
}