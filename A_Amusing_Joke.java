import java.util.Scanner;
public class A_Amusing_Joke {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] count1 = new int[26], count2 = new int[26];
        String[] str = new String[3];
        for (int i = 0; i < 3; i++) {
            str[i] = s.next();
        }
        for (int i = 0; i < str.length-1; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                count1[(int)(str[i].charAt(j)-'A')]++;
            }
        }
        for (int i = 0; i < str[2].length(); i++) {
            count2[(int)(str[2].charAt(i)-'A')]++;
        }
        for (int i = 0; i < 26; i++) {
            if(count1[i]!=count2[i]) { 
                System.out.println("NO");
                s.close();
                return;
            }
        }
        System.out.println("YES");
        s.close();
    }
}