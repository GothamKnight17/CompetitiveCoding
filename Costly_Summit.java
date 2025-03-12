import java.util.Scanner;

public class Costly_Summit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt(), c = s.nextInt();
            String lang = s.next();
            int[] cnt = new int[5];
            for (char x : lang.toCharArray()) {
                cnt[x - 'A']++;
            }

            int minCost = Integer.MAX_VALUE;
            for (int mask = 0; mask < (1 << 5); mask++) {
                int numLearned = 0;
                int covered = 0;
                for (int i = 0; i < 5; i++) {
                    if ((mask & (1 << i)) != 0) {
                        numLearned++;
                        covered += cnt[i];
                    }
                }
                int m = n - covered;
                int cost = numLearned * c + (m * (m + 1)) / 2;
                if (cost < minCost) {
                    minCost = cost;
                }
            }
            System.out.println(minCost);
        }
        s.close();
    }
}