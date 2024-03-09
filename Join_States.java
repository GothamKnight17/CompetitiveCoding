import java.util.*;
public class Join_States {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt(), m = s.nextInt();
            int[] ar = new int[n];
            int sum = 0, count = 0;
            for (int i = 0; i < ar.length; i++) {
                ar[i]=s.nextInt();
                sum+=ar[i];
                if(sum>=m){ 
                    sum=0;
                    count++;
                }
            }
            System.out.println(count);
        }
        s.close();
    }
}