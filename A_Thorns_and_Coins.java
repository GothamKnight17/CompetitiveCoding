import java.util.*;
public class A_Thorns_and_Coins {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int n = s.nextInt();
            String str = new String(s.next()).intern();
            int idx = str.indexOf("**");
            int count = 0;
            if(idx>=0)
            for (int i = 0; i < idx; i++) {
                if(str.charAt(i)=='@'){
                    count++;
                }
            }
            else{ 
                for (int i = 0; i < str.length(); i++) {
                    if(str.charAt(i)=='@'){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        s.close();
    }
}