/**
 * A_Cupboards
 */
import java.util.Scanner;
public class A_Cupboards {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int count1_l = 0, count1_r=0;
           for (int i = 0; i < n; i++) {
              for (int j = 0; j < 2; j++) {
                if(j==0 && arr[i][j]==1){ 
                    count1_l++;
                }
                if(j==1 && arr[i][j]==1){ 
                    count1_r++;
                }
              }
           }
           int total = 0;
           if(count1_r>=(n-count1_r))
           total+=(n-count1_r);
           else
           total+=(count1_r);

           if(count1_l>=(n-count1_l))
           total+=(n-count1_l);
           else
           total+=count1_l;
           System.out.println(total);
        s.close();
    }
}