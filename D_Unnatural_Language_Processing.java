import java.util.*;
public class D_Unnatural_Language_Processing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int n = s.nextInt();
            String str = new String(s.next());
            String ans = new String("");
            for (int i = str.length()-1; i > -1; ) {
                if(str.charAt(i)=='a'||str.charAt(i)=='e'){ 
                    if(i==1){ 
                        ans+=str.charAt(i);
                        ans+=str.charAt(i-1);
                    }else{ 
                        ans+=str.charAt(i);
                        ans+=str.charAt(i-1);
                        ans+='.';
                    }
                    i-=2;
                }else{ 
                    if(i==2){ 
                        ans+=str.charAt(i);
                        ans+=str.charAt(i-1);
                        ans+=str.charAt(i-2);
                    }else{ 
                        ans+=str.charAt(i);
                        ans+=str.charAt(i-1);
                        ans+=str.charAt(i-2);
                        ans+='.';
                    }
                    i-=3;
                }
            }
            for (int i = ans.length()-1; i >= 0; i--) {
                System.out.print(ans.charAt(i));
            }
            System.out.println();
        }
        s.close();
    }
}