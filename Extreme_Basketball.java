import java.util.Scanner;

/**
 * Extreme_Basketball
 */
public class Extreme_Basketball {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int a = s.nextInt(), b = s.nextInt();
            if(a-b>=10){ 
                System.out.println(0);
            }else{ 
                int x = (10+b-a)/3;
                int rem = (10+b-a)%3;
                int y = 0;
                if(rem==1)
                y = 1;
                else
                y=rem/2;
                int count = x + y;
                System.out.println(count);
            }
        }
        s.close();
    }
}