import java.util.*;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int n = s.nextInt();
            String str = new String(s.next());
            char[] ans = new char[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                ans[i]='P';
                if(str.charAt(i)=='R') { 
                    count++;
                }
            }
            int idx = n-1;
            while (count<=n/2) {
                char curr = str.charAt(idx);
                if(curr!='R'){ 
                    if(curr=='S'){ 
                        ans[idx]='R';
                    }else if(curr=='P'){ 
                        ans[idx]='S';
                    }
                    count++;
                }
                else{ 
                    count++;
                }
                idx--;
            }
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i]);
            }
            System.out.println();
        }
        s.close();
    }
}