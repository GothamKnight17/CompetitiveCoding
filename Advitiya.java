import java.util.Scanner;

/**
 * Advitiya
 */
public class Advitiya {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String ori = "ADVITIYA";
        while (t-->0) {
            String str = s.next();
            int step = 0;
            for (int i = 0; i < ori.length(); i++) {
                if(ori.charAt(i) != str.charAt(i)){
                    int temp = ori.charAt(i)-str.charAt(i);
                    if(temp>0)
                        step += temp;
                    else
                        step += 26+temp;
                }
            }
            System.out.println(step);
        }
        s.close();
    }
}