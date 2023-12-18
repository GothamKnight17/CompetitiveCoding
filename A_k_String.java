import java.util.*;

public class A_k_String {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        String str = new String(s.next());
        int[] count = new int[26];
        int dif = 0;
        for (int i = 0; i < str.length(); i++) {
            if (count[(int) (str.charAt(i) - 'a')] == 0)
                dif++;
            count[(int) (str.charAt(i) - 'a')]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] % k != 0) {
                System.out.println(-1);
                return;
            }
        }
        int temp = k;
        while(temp--!=0)
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < count[i]/k; j++) {
                System.out.print((char)(i+(int)'a'));
            }
        }
        s.close();
    }
}