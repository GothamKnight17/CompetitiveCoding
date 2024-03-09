import java.util.*;
public class Judged {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int count = 0;
            for (int i = 0; i < 5; i++) {
                int temp = s.nextInt();
                if(temp==1)
                count++;
            }
            if(count>=4){ 
                System.out.println("YES");
            }else{ 
                System.out.println("NO");
            }
        }
        s.close();
    }
}