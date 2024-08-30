import java.util.Scanner;
import java.lang.Math;
/**
 * Approximate_Answer
 */
public class Approximate_Answer {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x =s.nextInt(), y =s.nextInt(), k = s.nextInt();
        if(Math.abs(x-y)<=k){ 
            System.out.println("Yes");
        }else{ 
            System.out.println("No");
        }
        s.close();
    }
}