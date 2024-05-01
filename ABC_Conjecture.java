import java.util.Scanner;

/**
 * ABC_Conjecture
 */
public class ABC_Conjecture {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        outerloop: while (t-- != 0) {
            String a = s.next();
            String b = s.next();
            String[] A = a.split("b");
            String[] B = b.split("b");
            if (A.length != B.length) {
                System.out.println("No");
            } else {
                for (int i = 0; i < B.length; i++) {
                    if (B[i].length() != A[i].length()) {
                        System.out.println("No");
                        continue outerloop;
                    } 
                }
                int countaA = 0, countaB = 0, countcA=0, countcB=0;
                for (int i = 0; i < B.length; i++) {
                    for (int j = 0; j < B.length; j++) {
                        if(A[i].charAt(i)=='a')
                        countaA++;
                        else if(A[i].charAt(i)=='c')
                        countcA++;
                        if(B[i].charAt(i)=='a')
                        countaB++;
                        if(B[i].charAt(i)=='c')
                        countcB++; 
                    }
                }
                if(countaA==countaB)
            }
        }
        s.close();
    }
}