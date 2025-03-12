import java.util.Arrays;
import java.util.Scanner;

public class Lottery_Tickets {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0; i<a.length; i++) 
               a[i] = s.nextInt();
            int z = a[0];
            Arrays.sort(a);
            int idx=0;
            for(int i=0; i<n; i++)
                if(a[i]==z){ 
                   idx=i;
                   break;
                }
            int lt = 0, rt = 0;
            if(idx==n-1){
                
            }else if(idx==0){ 
            }else{
                
            }
            System.out.println(lt+rt+1);
        }
        s.close();
    }
}