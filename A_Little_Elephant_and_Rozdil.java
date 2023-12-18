import java.util.*;

public class A_Little_Elephant_and_Rozdil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n], temp = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            temp[i] = a[i];
        }

        if (n != 1) {
            Arrays.sort(temp);
            if (temp[0] == temp[1]) {
                System.out.println("Still Rozdil");
                return;
            } else {
                for (int i = 0; i < n; i++) {
                    if (temp[0] == a[i]) {
                        System.out.println(i + 1);
                        s.close();
                        return;
                    }
                }
            }
        } else {
            System.out.println(1);
        }
        s.close();
    }
}