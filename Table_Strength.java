import java.util.*;
public class Table_Strength {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int n = s.nextInt();
            int[] w =  new int[n];
            for(int i=0; i<n; i++){ 
                w[i]=s.nextInt();
            }
            Arrays.sort(w);
            int max = w[n-1];
            for(int i=w.length-1, j=1; i>=0; i--){ 
                int temp = w[i]*j;
                if(temp>max){
                    max=temp;
                }
                j++;
            }
            System.out.println(max);
        }
        s.close();
    }
}