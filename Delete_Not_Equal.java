import java.util.Scanner;

public class Delete_Not_Equal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            String str = s.next();
            int cnt1=0, cnt0=0;
            for(char c: str.toCharArray()){
                if(c=='0') cnt0++;
                else cnt1++;
            }
            if(cnt1==str.length() || cnt0==str.length())
              System.out.println(str.length());
            else {
                System.out.println(1);
            }
        }
        s.close();
    }
}