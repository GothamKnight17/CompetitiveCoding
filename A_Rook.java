import java.util.Scanner;

public class A_Rook {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            String pos = s.next();
            int num = pos.charAt(1)-'0';
            for (int i = 1; i <= 8; i++) {
                if(i!=num){ 
                    System.out.println(pos.charAt(0)+""+i);
                }
            }
            for (char i = 'a'; i <= 'h'; i++) {
                if(i!=pos.charAt(0)){ 
                    System.out.println(i+""+pos.charAt(1));
                }            
            }
        }
        s.close();
    }
}