import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class White_Wall {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t = s.nextInt();
        HashSet<String> set = new HashSet<>(Arrays.asList("RGB", "RBG", "BRG", "BGR","GBR","GRB"));
        while (t-->0) {
            int n = s.nextInt();
            String str = s.next();
            int cnt = 0;
            for(int i=0; i<n-2; i++){
                String temp = str.substring(i, i+3);
                if(!set.contains(temp)){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        s.close();
    }
}