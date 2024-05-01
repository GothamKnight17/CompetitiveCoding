import java.util.*;
public class Fake_Certificate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int n = s.nextInt();
            String str = new String(s.next()).intern();
            String[] spt = str.split("1");
            if(spt.length==0){ 
                System.out.println(str.length());
                continue;
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < spt.length; i++) {
                if(max<spt[i].length())
                max = spt[i].length();
            }
        }
        s.close();
    }
}