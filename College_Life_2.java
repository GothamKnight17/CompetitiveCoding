import java.util.HashSet;
import java.util.Scanner;
public class College_Life_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int S = s.nextInt();
            int[] q = new int[S];
            for (int i = 0; i < S; i++) {
                q[i]=s.nextInt();
            }
            int[] count = new int[S];
            int total = 0;
            HashSet<Integer> set = new HashSet<>();
            set.add(0);
            for (int i = 0; i < S; i++) {
                count[i] = s.nextInt();
                total+=count[i];
                set.add(total); 
            }
            int[] l = new int[total];
            total =0; 
            int j=0;
            for (int i = 0; i < l.length; i++) {
                l[i]=s.nextInt();
                if(set.contains(i)){ 
                    total+=l[i]-q[j++];
                }else{ 
                    total+=l[i];
                }
            }
            System.out.println(total);
        }
        s.close();
    }
}