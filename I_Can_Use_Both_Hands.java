import java.util.*;

public class I_Can_Use_Both_Hands {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int l = s.nextInt(), r = s.nextInt(), m = s.nextInt();
            System.out.println((int) (Math.ceil((double) m / l) + m / r));
        }
        s.close();
    }
}