import java.util.Arrays;
import java.util.Scanner;

/**
 * Maximise_Sum
 */
public class Maximise_Sum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int[] a = new int[n];
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                a[i]=s.nextInt();
                if(a[i]<=0){
                    count++;
                }
            }
            Arrays.sort(a);
            if(count%2==0){ 
                for(int i=0; i<count; i++){ 
                    a[i]=(-1)*a[i];
                }
            }else{ 
                int i = 0;
                for(; i<count-1 && i<n; i++){ 
                    a[i]=(-1)*a[i];
                }
                if(i<n-1)
                if((a[i]*(-1)+a[i+1]*(-1))>(a[i]+a[i+1])){ 
                    a[i]=-1*a[i];
                    a[i+1]=-1*a[i+1];
                }
            }
            int sum = 0;
            for (int i:a)
                sum+=i;
            System.out.println(sum);
        }
        s.close();
    }
}