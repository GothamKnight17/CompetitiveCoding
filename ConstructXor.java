import java.util.Scanner;

/**
 * ConstructXor
 */
public class ConstructXor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt(), S = s.nextInt();

            if(S%2!=0)
                System.out.println(-1);
            else{ 
                for (int i = 0; i < n; i++) {
                    System.out.print((S/n)+" ");
                }
                System.out.println();
            }
        }
        s.close();
    }
}