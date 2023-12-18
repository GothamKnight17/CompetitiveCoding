import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class ICPC_Balloons {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int n = s.nextInt();
            HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
            int[] a=new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i]=s.nextInt();
            }
            HashSet<Integer> dummy = new HashSet<>();
            int idx =0;
            int count=0;
            while (dummy.equals(set)==false && idx<n) {
                if(a[idx]==1||a[idx]==2||a[idx]==3||a[idx]==4||a[idx]==5||a[idx]==6||a[idx]==7){ 
                    dummy.add(a[idx]);
                }
                idx++;
                count++;
            }
            System.out.println(count);
        }
        s.close();
    }
}