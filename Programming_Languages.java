import java.util.HashSet;
import java.util.Scanner;

/**
 * Programming_Languages
 */
public class Programming_Languages {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            HashSet<Integer> set3 = new HashSet<>();
            for (int i = 0; i < 2; i++)
            set1.add(s.nextInt());
            for (int i = 0; i < 2; i++)
            set2.add(s.nextInt());
            for (int i = 0; i < 2; i++)
            set3.add(s.nextInt());
            if(set1.equals(set2))
            System.out.println(1);
            else if(set1.equals(set3))
            System.out.println(2);
            else
            System.out.println(0);
        }
        s.close();
    }
}