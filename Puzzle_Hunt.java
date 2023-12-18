/**
 * Puzzle_Hunt
 */
import java.util.Scanner;
public class Puzzle_Hunt {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n<6 || n>8)
        System.out.println("No");
        else
        System.out.println("Yes");
        s.close();
    }
}