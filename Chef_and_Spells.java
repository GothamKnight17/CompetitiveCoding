import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Chef_and_Spells
 */
public class Chef_and_Spells {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int[] x = new int[3];
            int min = Integer.MAX_VALUE;
            HashSet<Integer> set = new HashSet<>();
            int count = 0;
            for (int i = 0; i < x.length; i++) {
                x[i] = s.nextInt();
            }
            Arrays.sort(x);
            System.out.println((x[2]+x[1]));
        }
        s.close();
    }
}