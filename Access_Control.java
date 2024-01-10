import java.util.*;

public class Access_Control {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        tag: 
        while (t-- != 0) {
            int n = s.nextInt(), x = s.nextInt();
            String swipe = new String(s.next()).intern();
            int count = 0;
            boolean flag = false;
            for (int i = 0; i < swipe.length(); i++) {
                if(swipe.charAt(0)=='0'){ 
                    flag = false;
                    break;
                }
                if(swipe.charAt(i)=='0'){ 
                    if(count>0)
                    count--;
                    else if(count==0){ 
                        break;
                    }
                }
                else { 
                    count=x;
                }
                
                if(count>=n || count >= (n-1-i)){ 
                    flag = true;
                    break;
                }
            }
            if(flag == true)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        s.close();
    }
}