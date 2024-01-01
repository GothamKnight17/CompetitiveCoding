import java.util.*;
public class B_Not_Quite_Latin_Square {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        int idx1=0, idx2=0;
        while(t--!=0) {
            String[] lSquare = new String[3];
            HashSet<Character> set = new HashSet<>();
            set.add('A');
            set.add('B');
            set.add('C');
            int idx = 0;
            for (int i = 0; i < 3; i++) {
                lSquare[i]=s.next();
                for (int j = 0; j < lSquare[i].length(); j++) {
                    if(lSquare[i].charAt(j)=='?'){ 
                        idx = i;
                    }
                }
            }
            for (int i = 0; i < lSquare[idx].length(); i++) {
                if(set.contains(lSquare[idx].charAt(i)))
                set.remove(lSquare[idx].charAt(i));
            }
            Iterator it = set.iterator();
            System.out.println(it.next());
        }
        s.close();
    }
}