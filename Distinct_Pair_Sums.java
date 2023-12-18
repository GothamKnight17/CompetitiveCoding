import java.util.Scanner;

/**
 * Distinct_Pair_Sums
 */
public class Distinct_Pair_Sums {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int  t = s.nextInt();
        while (t--!=0) {
            int l =s.nextInt(), r=s.nextInt();
            int total = 2*r-2*l+1;
            System.out.println(total);
        }
        s.close();
    }
}