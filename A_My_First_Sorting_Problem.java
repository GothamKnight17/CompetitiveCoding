import java.util.Scanner;

/**
 * A_My_First_Sorting_Problem
 */
public class A_My_First_Sorting_Problem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int x = s.nextInt(), y = s.nextInt();
            int max = (x>y)?x:y;
            int min = (x>y)?y:x;
            System.out.println(min+" "+max);
        }
        s.close();
    }
}