import java.util.*;

public class Ultimate_Fencing {
    public static int Max(int i, int j) {
        if (i > j)
            return i;
        else
            return j;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt(), m = s.nextInt();
            HashSet<Integer> set = new HashSet<>();
            set.add(0);set.add(m);
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            for(int i = 0; i<n; i++){
                int max = Integer.MIN_VALUE;
                if(i==0) 
                   max =  Max(arr[i], (int)Math.abs(arr[i]-m));
                else if(i==1){
                    max = Max((int)Math.abs(arr[i]-arr[i-1]), (int)Math.abs(arr[i]-m));
                }
                else if(i!=n-1){ 
                    max = Max((int)Math.abs(arr[i]-arr[i-1]), (int)Math.abs(arr[i]-arr[i+1]));
                }
                else if(i==n-1){ 
                    max = Max((int)Math.abs(arr[i]-arr[i-1]), (int)Math.abs(arr[i]-m));
                }
                set.add(max);
            } 
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                System.out.print(it.next()+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
