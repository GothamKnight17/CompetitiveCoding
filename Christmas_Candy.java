import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Christmas_Candy
 */
public class Christmas_Candy {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt();
            int[] a =  new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i]=s.nextInt();
            }
            int count = 0;
            int max = a[0];
            for (int i = 0; i < a.length; i++) {
                if(max>a[i]){ 
                    count++;
                }
                if(max<a[i]){
                    max = a[i];
                }
            }
            System.out.println(count);
        }
        s.close();
    }
}