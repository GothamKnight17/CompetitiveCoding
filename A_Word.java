/**
 * A_Word
 */
import java.util.Scanner;
public class A_Word {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int upp=0, low =0;
        for (int i = 0; i < str.length(); i++) {
            if((int)str.charAt(i)<=90)
            upp++;
            else if((int)str.charAt(i)>=97)
            low++;
        }
        if(upp<=low)
            System.out.println(str.toLowerCase());
        else 
            System.out.println(str.toUpperCase());
        s.close();
    }
}