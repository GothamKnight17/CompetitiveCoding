import java.util.Scanner;

public class A_King_Keykhosrow_s_Mystery {
    public static int hcf(int a, int b){
        if(b==0){
            return a;
        }
        return hcf(b, a%b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        outerloop:
        while (t-->0) {
            int a = s.nextInt(), b = s.nextInt();
            int lcm = (a*b)/hcf(a, b);
            System.out.println(lcm);
            for (int i=a>b?b:a; i <= lcm; i++) {
                // System.out.println(i);
                if(a%i==b%i){
                    System.out.println(i);
                    continue outerloop;
                }
            }
        }
        s.close();
    }
}