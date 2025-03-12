import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chefland_Library {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            Map<Integer, Integer> dayP = new HashMap<>();
            for(int i=0; i<a.length; i++){
                dayP.put(a[i], Math.max(dayP.getOrDefault(a[i], 0), i+1));
            }
            int sum = 0;
            for(int val : dayP.values()){
                sum+=val;
            }
            System.out.println(sum);
        }
        s.close();
    }
}