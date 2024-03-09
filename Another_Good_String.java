import java.util.*;

public class Another_Good_String {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt(), q = s.nextInt();
            String str = new String(s.next()).intern();
            char[] upd = new char[q];
            for (int i = 0; i < q; i++) {
                upd[i] = s.next().charAt(0);
            }
            char temp = str.charAt(0);
            int[] count = new int[26];
            int max1 = Integer.MIN_VALUE;
            count[(int)(str.charAt(0)-'a')]++;
            for (int i = 1; i < str.length(); i++) {
                if(temp == str.charAt(i)){ 
                    count[(int)(str.charAt(i)-'a')]++;
                } 
                else{ 
                    temp = str.charAt(i);
                    count[(int)(str.charAt(i-1)-'a')]=0;
                } 
                if(max1 < count[(int)(str.charAt(i)-'a')]){ 
                    max1 = count[(int)(str.charAt(i)-'a')];
                }        
            }
            System.out.print((max1+1)+" ");
            int max2 = Integer.MIN_VALUE;
            for (int i = 0; i < upd.length; i++) {
                if(temp==upd[i]){ 
                    count[(int)(upd[i]-'a')]++;
                }else{ 
                    temp = upd[i];
                    if(i>0)
                    count[(int)upd[i-1]-'a']=0;
                }
                if(max2 < count[(int)upd[i]-'a']){ 
                    max2=count[(int)upd[i]-'a'];
                }
                if(max2>max1){ 
                    System.out.print((max2+1)+" ");
                }
                else{ 
                    System.out.print((max1+1)+" ");
                }
            }
            System.out.println();
        }
        s.close();
    }
}