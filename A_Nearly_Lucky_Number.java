/**
 * A_Nearly_Lucky_Number
 */
import java.util.HashSet;
import java.util.Scanner;
public class A_Nearly_Lucky_Number {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        long lucky = 0;
        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i)=='4' || n.charAt(i)=='7')
               lucky++;
        }
        String str = Long.toString(lucky);
        HashSet<Character> set = new HashSet<>();
        set.add('4');
        set.add('7');
            for (int i = 0; i < str.length(); i++) {
            if(set.contains(str.charAt(i))==false)
            { 
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        s.close();
    }
}