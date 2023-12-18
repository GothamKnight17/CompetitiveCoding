import java.util.Arrays;
import java.util.Scanner;

/**
 * A_Helpful_Maths
 */
public class A_Helpful_Maths {

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        String str = new String(s.next());
        int n = str.length()/2;
        int[] summands = new int[str.length()-n];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='1' || str.charAt(i)=='2' || str.charAt(i)=='3') {
                String temp = Character.toString(str.charAt(i));
                summands[j++] = Integer.parseInt(temp);
            }
        }
        Arrays.sort(summands);
        for (int i = 0; i < summands.length; i++) {
            if(i==0){ 
                System.out.print(summands[i]);
            }
            else
                System.out.print("+"+summands[i]);
        }
        s.close();
    }
}