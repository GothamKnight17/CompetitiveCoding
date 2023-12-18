import java.util.*;

public class B_The_Corridor_or_There_and_Back_Again {
    public static int minOf(int i, int j) { 
       if(i>j)
       return j;
       else
       return i;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            int[] d = new int[n];
            int[] sc = new int[n];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                d[i] = s.nextInt();
                sc[i] =s.nextInt();
            } 
            for (int i = 0; i < n; i++) {
                if(min>minOf(min, d[i]+((sc[i]-1)/2)))
                   min =  d[i]+((sc[i]-1)/2);
            }
            System.out.println(min);
        }
        s.close();
    }
}