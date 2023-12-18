import java.util.Scanner;

/**
 * Smallest_Possible_Whole_Number
 */
public class Smallest_Possible_Whole_Number {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while (t--!=0) {
            int n = s.nextInt(), k = s.nextInt();
            if(k!=0)
            System.out.println(n%k);
            else
            System.out.println(n);
        }
        s.close();
    }
}