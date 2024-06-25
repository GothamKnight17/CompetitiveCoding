import java.util.Scanner;

/**
 * Distribute_Cookies
 */
public class Distribute_Cookies {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt(), m = s.nextInt();
            if(n<m){ 
                int rem = m%n;
                System.out.println(rem>(n-rem)?(n-rem):rem);
            }else{ 
                System.out.println(n-m);
            }
        }
        s.close();
    }
}