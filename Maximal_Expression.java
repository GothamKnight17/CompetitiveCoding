import java.util.*;

public class Maximal_Expression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt(), k = s.nextInt();
            HashSet<Integer> set = new HashSet<>(), ans = new HashSet<>();
            for (int i = 0; i <= (k-1); i++) {
                set.add(i);
            }
            int count = 0, max = Integer.MIN_VALUE;
            
            System.out.println(max);
        }
        s.close();
    }
}