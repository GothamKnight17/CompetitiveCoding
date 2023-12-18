import java.util.*;

public class A_Chat_room {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            String str = new String(s.next());
            int count[] = new int[26];
            String ans = new String("");
            for (int i = 0; i < str.charAt(i); i++) {
                count[(int)str.charAt(i)-(int)'a']++;
            }
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                char curr = str.charAt(i);
                if(curr=='h'||curr=='e'||curr=='l'||curr=='o'){
                    if(set.contains(curr)==false){ 
                        ans+=curr;
                        set.add(curr);
                    }
                }
            }
            if(ans.equals("helo") && count[(int)('l'-'a')]>1)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        s.close();
    }
}