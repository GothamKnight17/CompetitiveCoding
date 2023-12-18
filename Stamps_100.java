import java.util.*;

public class Stamps_100 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            StringBuilder str = new StringBuilder(s.next());
            int i = 0;
            for (; i < n-2; i+=3) {
                String temp = "";
                temp+=str.charAt(i);
                temp+=str.charAt(i+1);
                temp+=str.charAt(i+2);
                if(Integer.parseInt(temp)>100){ 
                    str.replace(i, i+3, "100");
                }
            }
            String temp = "";
            int k = 0;
            int idx = i;
            for (; i < n; i++) {
                temp+=str.charAt(i);
            }
            if(temp.equals("")==false){ 
                if((int)Math.pow(1, k)<Integer.parseInt(temp)){ 
                    int l = (int)Math.pow(1, k);
                    String temp1 = String.valueOf(l);
                    str.replace(idx, n, temp1);
                }
            }
            System.out.println(str);
        }
        s.close();
    }
}