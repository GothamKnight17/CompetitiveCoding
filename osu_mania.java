
import java.util.Scanner;
public class osu_mania {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            String str[] = new String[n];
            for (int i = 0; i < str.length; i++) {
                str[i] = s.next();
            }
            for (int i = str.length-1; i >= 0; i--) {
                for (int j = 0; j < str[i].length(); j++) {
                    if(str[i].charAt(j)=='#'){ 
                        System.out.print((j+1)+" ");
                    }
                }
            }
            System.out.println();
        }
        s.close();
    }
}