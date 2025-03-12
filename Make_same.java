import java.util.Scanner;

public class Make_same {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            String s1 = s.next();
            String s2 = s.next();
            String s3 = s.next();
            int x1 = countOnes(s1);
            int y1 = countOnes(s2);
            int z1 = countOnes(s3);
            int total = x1 + y1 + z1;

            if (total % n != 0) {
                System.out.println(-1);
                continue;
            }

            int k = total / n;
            int swaps;
            if (k == 0 || k == 3) {
                swaps = 0;
            } else if (k == 1) {
                swaps = Math.min(x1 + y1, Math.min(x1 + z1, y1 + z1));
            } else {
                swaps = Math.min(x1, Math.min(y1, z1));
            }

            System.out.println(swaps);
        }
        s.close();
    }

    private static int countOnes(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') count++;
        }
        return count;
    }
}