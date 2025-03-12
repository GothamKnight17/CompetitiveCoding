import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Deletion_and_Difference {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int[] a = new int[n];
            HashMap<Integer, Integer> eleCnt = new HashMap<>(); 
            boolean zeroPresent = false;
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
                if(a[i]==0) zeroPresent = true;
                eleCnt.put(a[i], eleCnt.getOrDefault(a[i], 0)+1);
            }

            if(n==eleCnt.size()){
                System.out.println(n);
                continue;
            }

            int ans = n, count0 = 0;
            if(zeroPresent){
                for(Map.Entry<Integer, Integer> entry : eleCnt.entrySet()){
                    if(entry.getKey()!=0){
                        int cnt = entry.getValue();     
                        ans -= (((int)(cnt/2)) * 2);
                        ans += (int)(cnt/2);
                        count0 += cnt/2;
                    }
                }
            }
            else{ 
                for(Map.Entry<Integer, Integer> entry : eleCnt.entrySet()){
                    int cnt = entry.getValue();     
                    ans -= (((int)(cnt/2)) * 2);
                    ans += (int)(cnt/2);
                    count0 += cnt/2;
                }
            }

            eleCnt.put(0, eleCnt.getOrDefault(0, 0)+count0);

            int cnt = eleCnt.get(0);
            ans -= (cnt-1);
            System.out.println(ans);
        }
        s.close();
    }
}