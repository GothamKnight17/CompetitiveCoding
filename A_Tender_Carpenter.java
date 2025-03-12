import java.util.Scanner;

public class A_Tender_Carpenter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        loop1: while (t-- > 0) {
            int n = s.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < A.length; i++) {
                A[i] = s.nextInt();
            }
            for(int i=0; i<A.length-1; i++){
                int a = A[i], b = A[i+1];
                if(2*Math.min(a,b)>Math.max(a,b)){
                    System.out.println("YES");
                    continue loop1;
                }
            }
            System.out.println("NO");
        }
        s.close();
    }
}