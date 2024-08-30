import java.util.Scanner;

/**
 * Magical_World
 */
public class Magical_World {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int a = s.nextInt(), b = s.nextInt(), x = s.nextInt();
            int rec = a*b, sq = x*x;
            if(rec<=sq){ 
                System.out.println(0);
            }else if(Math.min(a, b)<=x){ 
                System.out.println(1);
            }else{ 
                System.out.println(2);
            }
        }
        s.close();
    }
}