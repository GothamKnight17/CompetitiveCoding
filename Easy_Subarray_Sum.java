import java.util.Scanner;

/**
 * Easy_Subarray_Sum
 */
public class Easy_Subarray_Sum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int[] a = new int[n];
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
                if(a[i]<=0){
                    count++;
                }
            }
            if(count==n){ 
                System.out.println(0);
                continue;
            }
            int l = -1, r = -1;
            for (int i = 0; i < a.length; i++) {
                if(a[i]>0){ 
                    l = i;
                    break;
                }
            }
            for (int i = n-1; i >= 0; i--) {
                if(a[i]>0){ 
                    r = i;
                    break;
                }
            }
            count = 0;
            for (int i = l; i <= r; i++) {
                if(a[i]<0)
                   count++;
            }
            System.out.println(count);
        }
        s.close();
    }
}