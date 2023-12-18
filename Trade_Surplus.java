import java.util.Scanner;

/**
 * Trade_Surplus
 */
public class Trade_Surplus {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int a1 = s.nextInt(), a2 = s.nextInt(), b1 = s.nextInt(), b2 = s.nextInt();
            int c2 = a1+b1, c1=a2+b2;
            if(c1>c2){ 
                System.out.println("YES");
            }
            else{ 
                System.out.println("NO");
            }
        }
        s.close();
    }
}