import java.util.Scanner;

/**
 * A_Stones_on_the_Table
 */
public class A_Stones_on_the_Table {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int count =0;
        String str = new String(s.next());
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i)==str.charAt(i+1))
                count++;
        }
        System.out.println(count);
        s.close();
    }
}