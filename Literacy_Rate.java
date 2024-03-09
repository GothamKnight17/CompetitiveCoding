import java.util.*;
public class Literacy_Rate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            float p = s.nextFloat(), l = s.nextFloat();
            if(l/p>=0.75){ 
                System.out.println("YES");
            }
            else{ 
                System.out.println("NO");
            }
        }
        s.close();
    }
}