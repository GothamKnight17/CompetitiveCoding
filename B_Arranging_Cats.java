import java.util.*;

public class B_Arranging_Cats {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            String si = s.next();
            int countS=0;
            String f = s.next();
            int countF=0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if(si.charAt(i)=='1' && f.charAt(i)=='1'){ 
                    count++;
                }
                if(si.charAt(i)=='1'){ 
                    countS++;
                }
                if(f.charAt(i)=='1'){ 
                    countF++;
                }
            }
            if(countF>countS){ 
                System.out.println(countS+(countF-countS)-count);
            }else if(countF<countS){ 
                System.out.println(countF+(countS-countF)-count);
            }else{ 
                System.out.println(countS-count);
            }
        }
        s.close();
    }
}