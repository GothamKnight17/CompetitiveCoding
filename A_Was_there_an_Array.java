import java.util.Scanner;

public class A_Was_there_an_Array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        outerloop:
        while (t-->0) {
            int n = s.nextInt(), b[] = new int[n-2];
            for (int i = 0; i < b.length; i++) {
                b[i] = s.nextInt();
            }
            for(int i = 0; i<b.length-2; i++){
                int x1 = b[i], x2 = b[i+1], x3 = b[i+2];
                if(x1==1 && x2==0 && x3==1){
                    System.out.println("NO");
                    continue outerloop;
                }
            }
            System.out.println("YES");
        }
        s.close();
    }
}