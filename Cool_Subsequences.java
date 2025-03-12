
import java.util.HashSet;
import java.util.Scanner;

public class Cool_Subsequences {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(); 
        while(t-->0){
            int n =s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            int found = -1;
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < a.length; i++) {
                if(set.contains(a[i])){
                    found = a[i];
                    break;
                }
                set.add(a[i]);
            }
            System.out.println(found);
        }
        s.close();
    }
}