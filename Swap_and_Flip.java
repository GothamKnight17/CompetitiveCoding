import java.util.Scanner;

public class Swap_and_Flip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int n = sc.nextInt();
            String s = sc.next(), t = sc.next();
            if(s.equals(t)){
                System.out.println("YES");
            }else{
                int cnt1s = 0, cnt1t = 0;
                for(int i =0; i<n ; i++){
                    if(s.charAt(i)=='1')
                       cnt1s++;
                    if(t.charAt(i)=='1')
                       cnt1t++;
                }
                System.out.println(((cnt1s-cnt1t)%2==0)?"YES":"NO");
            }
        }
        sc.close();
    }
}