import java.util.Scanner;

/**
 * A_Panoramix_s_Prediction
 */
public class A_Panoramix_s_Prediction {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        int nextPrime = 0;
        for (int i = 1; ; i++) {
            int temp = n+i;
            int div =0;
            for (int j = 1; j <= temp/2; j++) {
                if(temp%j==0)
                   div++;
            }
            if(div>=2)
               continue;
            else {
               nextPrime = temp;
               break;    
            }
        }
        if(nextPrime==m)
        System.out.println("YES");
        else
        System.out.println("NO");
        s.close();
    }
}