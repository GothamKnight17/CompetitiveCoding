import java.util.*;

public class A_Problemsolving_Log {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            String str = new String(s.next());
            int[] time = new int[26];
            for (int i = 0; i < str.length(); i++) {
                time[str.charAt(i)-'A']++;
            }
            int count = 0;
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                char curr = str.charAt(i);
                if (set.contains(curr)) {
                    continue;
                }else{ 
                    set.add(curr);
                    if(curr-'A'+1<=time[curr-'A'])
                    count++;
                }
            }
            System.out.println(count);
        }
        s.close();
    }
}