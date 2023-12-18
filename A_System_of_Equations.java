import java.util.*;
import java.lang.Math;
public class A_System_of_Equations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        int a = (int)Math.sqrt(n), count=0;
        for (int i = 0; i <= a; i++) {
            int b = n - i*i;
            if((b*b + i) == m)
               count++;
        }
        System.out.println(count);
        s.close();
    }
}