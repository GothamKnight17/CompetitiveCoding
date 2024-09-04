
import java.util.HashSet;
import java.util.Scanner;

/**
 * D_Satyam_and_Counting
 * 
 */

public class D_Satyam_and_Counting {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            long count = 0;
            HashSet<Integer> xx = new HashSet<>(), yy = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int x = s.nextInt(), y = s.nextInt();
                if(y==0){ 
                    xx.add(x);
                }else{
                    yy.add(x);
                }
            }
            for (int i : xx) {
                if(yy.contains(i)==true){ 
                    count+=xx.size()-1;
                }
                if(yy.contains(i-1) && yy.contains(i+1)){ 
                    count++;
                }
            }
            for(int i : yy){ 
                if(xx.contains(i)==true){ 
                    count+=yy.size()-1;
                }
                if(xx.contains(i-1) && xx.contains(i+1)){ 
                    count++;
                }
            }
            System.out.println(count);
        }
        s.close();
    }
}