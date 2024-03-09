import java.util.*;

public class A_Tricky_Template {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        tag:
        while (t-- != 0) {
            int n = s.nextInt();
            String a = s.next(), b = s.next(), c = s.next();
            if (a.equals(c) || b.equals(c)) {
                System.out.println("NO");
                continue tag;
            }
            for (int i = 0; i < n; i++) {
                char tempA=a.charAt(i), tempB=b.charAt(i), tempC=c.charAt(i);
                if(tempA==tempC || tempB==tempC){ 
                    System.out.println("NO");
                    continue tag;
                }
            }
            System.out.println("YES");
        }
        s.close();
    }
}