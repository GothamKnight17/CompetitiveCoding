import java.util.Scanner;

/**
 * B_Different_String
 */
public class B_Different_String {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int alb[] = new int[26], count = 0; 
            String str = s.next();
            for (int i = 0; i < str.length(); i++) {
                alb[str.charAt(i)-'a']++;
            }
            for(int i =0; i<alb.length; i++){ 
                if(alb[i]!=0){ 
                    count++;
                }
            }
            if(count == 1){ 
                System.out.println("NO");
            }else{ 
                System.out.println("YES");
                for(int i=str.length()-1; i>=0; i--){ 
                    System.out.print(str.charAt(i));
                }
                System.out.println();
            }
        }
        s.close();
    }
}