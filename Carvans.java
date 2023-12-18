import java.util.Scanner;

public class Carvans {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int count = 0;
            int n=s.nextInt(); 
            int[] max = new int[n];
            for (int i = 0; i < n; i++) {
                max[i] = s.nextInt();
            }
            int Max = Integer.MAX_VALUE;
            for (int i = 0; i < max.length; i++) {
                if(Max>=max[i]){ 
                    count++;
                    Max=max[i];
                }
            }
            System.out.println(count);
        }
        s.close();
    }
}