import java.util.*;
public class B_YetnotherrokenKeoard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t--!=0) {
            String str = s.next();
            char[] ch = new char[str.length()];
            for (int i = 0; i < ch.length; i++) {
                ch[i]=str.charAt(i);
            }
            for(int i=0; i< str.length(); i++){ 
                int idx1=-1, idx2=-1;
                if(ch[i]>='a' && ch[i]<='z' && ch[i]!='b'){ 
                    idx1=i;
                }
                if(ch[i]>='A'&& ch[i]<='Z' && ch[i]!='B'){ 
                    idx2=i;
                }
                if(ch[i]=='B'){ 
                    if(idx1!=-1)
                       ch[i]=' ';
                    ch[i]=' ';
                }else if(ch[i]=='b'){ 
                    if(idx2!=-1)
                       ch[i]=' ';
                    ch[i]=' ';
                }
            }
            str="";
            for (int i = 0; i < ch.length; i++) {
                if(ch[i]!=' ')
                str+=ch[i];
            }
            System.out.println(str);
        }
        s.close();
    }
}