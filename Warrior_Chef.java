import java.util.*;
/**
 * Warrior_Chef
 */
public class Warrior_Chef {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t--!=0){ 
            int n = s.nextInt(), h = s.nextInt();
            int[] A = new int[n];
            int  sum = 0;
            for (int i = 0; i < n; i++) {
                A[i] = s.nextInt();
            }
            for (int i = 0; i < A.length; i++) {
                sum+=A[i];
            }
            if(sum<h){ 
                System.out.println(0);
            }
            else{ 
                Arrays.sort(A);
                int[] postSum = new int[n]; 
                postSum[0]=sum;
                for (int i = 1; i < A.length; i++) {
                    sum-=A[i-1];
                    postSum[i]=sum;
                }
                for (int i = 0; i < postSum.length; i++) {
                    if(h+A[i]>postSum[i]){
                        System.out.println(A[i]);
                        break;
                    }
                }
            }
        }
        s.close();
    }
}