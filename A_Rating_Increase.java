import java.util.*;

public class A_Rating_Increase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        loop:
        while (t-- != 0) {
            String num = s.next();
            String a = num.substring(0, 1);
            String b = num.substring(1, num.length()-1);
            for (int i = 1; i < num.length() ; i++) {
                a = num.substring(0, i);
                b = num.substring(i, num.length());
                if(b.charAt(0)!='0'){ 
                    if(Integer.parseInt(b)>Integer.parseInt(a)){ 
                        System.out.println(a+" "+b);
                        continue loop;
                    }
                }
            }
            System.out.println(-1);
        }
        s.close();
    }
}