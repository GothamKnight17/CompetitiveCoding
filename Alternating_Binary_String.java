import java.util.Scanner;

/**
 * Alternating_Binary_String
 */
public class Alternating_Binary_String {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt();
            String str = s.next();
            char[] arr = str.toCharArray();
            char[] cntr = str.toCharArray();
            for(int i=1; i<n; i++){ 
                if(arr[i]=='0')
                   cntr[i]='1';
                else  
                   cntr[i]='0';
            }
            int count = 0; 
            if(str.length()==1)
            System.out.println(0);
            else{ 
                while (!arr.toString().equals(cntr.toString())) {
                    
                }
            }
        }
        s.close();
    }
}