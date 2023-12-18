import java.util.*;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            String a = s.next();
            String b = s.next();
            int c = 0, ch = 0, d=0;
            for (int i = 0; i < n; i++) {
                char cur_c = a.charAt(i), cur_ch = b.charAt(i);
                if ((cur_c == 'R' && cur_ch == 'S') || (cur_c == 'S' && cur_ch == 'P')
                        || (cur_c == 'P' && cur_ch == 'R'))
                    c++;
                else if ((cur_ch == 'S' && cur_c == 'P') || (cur_ch == 'P' && cur_c == 'R')
                        || (cur_ch == 'R' && cur_c == 'S'))
                    ch++;
                else 
                    d++;

            }
            if(c>ch){ 
                System.out.println(0);
            }else{ 
                int count = 0;
                while (c<=ch) {
                    c++;
                    ch--;
                    count++;
                }
                System.out.println(count);
            }
        }
        s.close();
    }
}