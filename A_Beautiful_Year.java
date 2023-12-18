import java.util.HashSet;
import java.util.Scanner;

/**
 * A_Beautiful_Year
 */
public class A_Beautiful_Year {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        label: for (int i = 1;; i++) {
            HashSet<Integer> set = new HashSet<>();
            int temp = i + y;
            int temp1 = temp;
            while (temp1 > 0) {
                int cur = temp1 % 10;
                temp1 /= 10;
                if (set.contains(cur)) {
                    continue label;
                } else {
                    set.add(cur);
                }
            }
            System.out.println(temp);
            break;
        }
        s.close();
    }
}