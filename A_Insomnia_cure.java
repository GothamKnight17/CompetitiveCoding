import java.util.Scanner;

/**
 * A_Insomnia_cure
 */
public class A_Insomnia_cure {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt(), l = s.nextInt(), m = s.nextInt(), n = s.nextInt();
        int d = s.nextInt();
        int sum = 0;
        for (int i = 1; i < d+1; i++) {
            if(i%k==0||i%l==0||i%m==0||i%n==0){ 
                sum++;
            }
        }
        System.out.println(sum);
        s.close();
    }
}