import java.util.Scanner;

/**
 * C_The_Legend_of_Freya_the_Frog
 */
public class C_The_Legend_of_Freya_the_Frog {

    public static int steps(int x, int y, int k){
        int count = 0;
        x = (int)Math.ceil((double)x/k);
        y = (int)Math.ceil((double)y/k);
        if(x>y){ 
            return (2*x - 1);
        }else{ 
            return 2*y; 
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int x = s.nextInt(), y = s.nextInt(), k = s.nextInt();
            System.out.println(steps(x, y, k));
        }
        s.close();
    }
}