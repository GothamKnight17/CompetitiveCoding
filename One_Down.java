import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class One_Down {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(reader.readLine().trim());
        while (T-- > 0) {
            int N = Integer.parseInt(reader.readLine().trim());
            String S = reader.readLine().trim();
            String Tstr = reader.readLine().trim();

            int sCount = 0, tCount = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') sCount++;
                if (Tstr.charAt(i) == '1') tCount++;
            }

            boolean possible = true;
            // Cannot have more 1s in T than in S
            if (tCount > sCount || ((sCount - tCount) % 2 != 0)) {
                possible = false;
            } else {
                // Every 1 in T must already be a 1 in S
                for (int i = 0; i < N; i++) {
                    if (Tstr.charAt(i) == '1' && S.charAt(i) == '0') {
                        possible = false;
                        break;
                    }
                }
            }

            sb.append(possible ? "Yes" : "No").append('\n');
        }

        System.out.print(sb);
    }
}