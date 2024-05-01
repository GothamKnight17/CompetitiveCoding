import java.util.Scanner;

/**
 * A_Painting_the_Ribbon
 */
public class A_Painting_the_Ribbon {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt(), m = s.nextInt(), k = s.nextInt();
            int com = n - m + 1;
            if((n-com)>k)
               System.out.println("YES");
            else 
               System.out.println("NO");
        }
    }
}