import java.util.Scanner;

/**
 * Survival_Time
 */
public class Survival_Time {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while (t--!=0) {
            int n=s.nextInt(), x=s.nextInt(), d=s.nextInt();
            int eDay = 5*x;
            System.out.println(n/eDay+d);
        }
        s.close();
    }
}