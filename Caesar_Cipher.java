import java.util.Scanner;

/**
 * Caesar_Cipher
 */
public class Caesar_Cipher {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int q = s.nextInt();
		while(q--!=0){ 
		   int n = s.nextInt();
		   String str = new String(s.next());
		   String t = new String(s.next());
		   String u = new String(s.next());
		   int k = Math.abs((int)str.charAt(0)-(int)t.charAt(0));
		   String fresh = new String("");
		   for (int i=0;i<n ;i++ ){ 
		       char temp;
		       if((int)u.charAt(i)+k-(int)'a'>25){ 
		           temp = (char)((int)u.charAt(i)+k-26);
		       }
		       else
		           temp = (char)((int)u.charAt(i)+k);
		      fresh+=temp;
		   }
		   System.out.println(fresh);
		   fresh="";
		}
    }
}