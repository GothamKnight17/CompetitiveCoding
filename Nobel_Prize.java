import java.util.HashSet;
import java.util.Scanner;

public class Nobel_Prize {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt(), m = s.nextInt();
            HashSet<Integer> set = new HashSet<>();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
                if(set.contains(a[i])==false){ 
                    set.add(a[i]);
                }
            }
            if (set.size() < m) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        s.close();
    }
}