import java.util.Scanner;
import java.util.Arrays;

/**
 * K_Closeness
 */
public class K_Closeness {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n =s.nextInt(), k =s.nextInt(), a[]=new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            Arrays.sort(a);
            int preMin[]=new int[n-1];
            int max = a[n-1];
            for(int i=0; i<n-1; i++){ 
                preMin[i]=max-a[i];
            }
        }
        s.close();
    }
}