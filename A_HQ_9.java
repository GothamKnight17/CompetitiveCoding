import java.util.Scanner;
public class A_HQ_9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = new String(s.next());
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='H'|| str.charAt(i)=='Q'||str.charAt(i)=='9') { 
                System.out.println("YES");
                s.close();
                return;
            }
        }
        System.out.println("NO");
        s.close();
    }
}