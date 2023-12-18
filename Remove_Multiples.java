import java.util.Scanner;

/**
 * Remove_Multiples
 */
public class Remove_Multiples {

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0) { 
		    long n = s.nextLong();
		    long m = s.nextLong();
		    long a[] = new long[(int)m];
		    long sum1=0, sum2=0;
		    for (int i=0;i<m ;i++ ){ 
		        a[i] = s.nextInt();
                sum1+=a[i];
		    }
            sum2 = ((n*(n+1))/2);
            System.out.println(sum2-sum1);
        }
        s.close();    
    }
}