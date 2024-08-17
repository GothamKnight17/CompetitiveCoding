import java.util.Scanner;

/**
 * Swap_the_numbers
 */
public class Swap_the_numbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            long n = s.nextLong(), k =s.nextLong();
            long A[] = new long[(int)n];
            for (int i = 0; i < A.length; i++) {
              A[i] = s.nextLong();
            }
            StringBuilder swap = new StringBuilder("");
            StringBuilder no_swap = new StringBuilder("");
            for (int i = 0; i < A.length; i++) {
                if((i+k)<n || i>=k) { 
                    swap.append(i);
                }
                else
                    no_swap.append(i);
            }
        }
        s.close();
    }
}