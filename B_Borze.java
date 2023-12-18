import java.util.Scanner;

/**
 * B_Borze
 */
public class B_Borze {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String code = s.next();
        String temp = "";
        for (int i = 0; i < code.length(); ) {
            if(code.charAt(i)=='.'){
                System.out.print("0");
                i++;
            }
            else if(code.charAt(i)=='-' && code.charAt(i+1)=='.'){
                System.out.print("1");
                i+=2;
            }
            else if(code.charAt(i)=='-' && code.charAt(i+1)=='-'){
                System.out.print("2");
                i+=2;
            }
        }
        s.close();
    }
}