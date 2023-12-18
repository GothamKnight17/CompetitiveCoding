import java.util.Scanner;

/**
 * A_Petya_and_Strings
 */
public class A_Petya_and_Strings {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = new String(s.next());
        String str2 = new String(s.next());
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            int temp1 = (int)str1.charAt(i);
            int temp2 = (int)str2.charAt(i);
            if(temp1>temp2) { 
                System.out.println("1");
                s.close();
                return;
            }
            else if(temp1<temp2) { 
                System.out.println("-1");
                s.close();
                return;
            }
        }
            System.out.println("0");
        s.close();
    }
}