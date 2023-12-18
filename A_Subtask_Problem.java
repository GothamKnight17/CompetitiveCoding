import java.util.Scanner;

public class A_Subtask_Problem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt(), m = s.nextInt(), k = s.nextInt();
            int[] a = new int[n];
            int count_corr = 0;
            boolean flag = true;
            int count_conti = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
                if(a[i]==1){ 
                    count_corr++;
                    if(flag==true){ 
                        count_conti++;
                    }
                }else { 
                    flag = false;
                }
            }
            if(count_corr==n)
            System.out.println(100);
            else if(count_conti>=m)
            System.out.println(k);
            else
            System.out.println(0);
        }
        s.close();
    }
}