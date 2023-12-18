import java.util.*;
public class A_Translation {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String s1 = s.next();
       String s2 = s.next();
       String rev_s2 = "";
       for (int i = s2.length()-1; i > -1 ; i--) {
         rev_s2+=s2.charAt(i);
       }
       if(rev_s2.equals(s1))
       System.out.println("YES");
       else
       System.out.println("NO");
       s.close();
    }
}