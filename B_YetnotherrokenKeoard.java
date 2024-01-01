import java.util.*;

public class B_YetnotherrokenKeoard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            String str = s.next();
            char[] ch = new char[str.length()];
            for (int i = 0; i < ch.length; i++) {
                ch[i] = str.charAt(i);
            }
            
            for (int i = 0; i < ch.length; i++) {
                if(ch[i]!=' ')
                System.out.print(ch[i]);
            }
            System.out.println();
        }
        s.close();
    }
}