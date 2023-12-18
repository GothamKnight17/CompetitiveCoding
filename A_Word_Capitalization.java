import java.util.Scanner;

/**
 * A_Word_Capitalization
 */
public class A_Word_Capitalization {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = new String(s.next());
        char put = str.charAt(0);
        if((int)put<=90)
        System.out.println(str);
        else
        System.out.println(str.substring(0,1).toUpperCase()+str.substring(1, str.length()));
        s.close();
    }
}