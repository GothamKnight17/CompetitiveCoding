import java.util.*;
public class Hattrick {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            char[] score= new char[6];
            for (int i = 0; i < score.length; i++) {
                score[i]=s.next().charAt(0);
            }
            String str = new String(score);
            if(str.contains("WWW"))
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        s.close();
    }
}