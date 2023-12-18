import java.util.*;

public class Slow_Start {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int x = s.nextInt(), h = s.nextInt();
            int x2 = x/2;
            if(5*x2>=h){ 
                System.out.println((int)Math.ceil((float)h/x2));
            }
            else { 
                int rem = h - 5*x2;
                int total=(int)Math.ceil((float)rem/x) + 5;
                System.out.println(total);
            }
        }
        s.close();
    }
}