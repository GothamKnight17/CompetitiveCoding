import java.util.Arrays;
import java.util.Scanner;

/**
 * Dice_Deception
 */
public class Dice_Deception {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt(), k =s.nextInt(), a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=s.nextInt();
            }
            Arrays.sort(a);
            int sum = 0, cnt = 0;
            for (int i=0; i<n; i++) {
                if(a[i]<(7-a[i]) && cnt<k){ 
                    a[i]=(7-a[i]);
                    cnt++;
                }
            }
            for(int i:a)
               sum+=i;
            System.out.println(sum);
        }
        s.close();
    }
}