import java.util.HashSet;
import java.util.Scanner;

/**
 * Card_Swipe
 */
public class Card_Swipe {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt();
            int[] a = new int[n], b = new int[n];
            int sum =0;
            int max = Integer.MIN_VALUE;
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
                if (set.contains(a[i])==false) {
                   set.add(a[i]);
                   sum++;
                   if(max<sum) { 
                    max=sum;
                   }
                }
                else { 
                    sum--;
                }
            }
            System.out.println(max);
        }
        s.close();
    }
}