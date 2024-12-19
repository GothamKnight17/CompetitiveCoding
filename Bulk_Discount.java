import java.util.Arrays;
import java.util.Scanner;

public class Bulk_Discount {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i]=s.nextInt();
            }
            Arrays.sort(a);
            int i = 0;
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                if(a[j]-i<0){
                    sum+=0;
                }else{
                    sum+=a[j]-i;
                }
                i++;
            }
            System.out.println(sum);
        }
        s.close();
    }
}