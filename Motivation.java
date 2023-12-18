import java.util.Scanner;

/**
 * Motivation
 */
class Movies {
    int s, r;

    public void dataMovies(int si, int ri) {
        this.s = si;
        this.r = ri;
    }
}

public class Motivation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt(), x = s.nextInt();
            Movies[] m = new Movies[n];
            for (int i = 0; i < n; i++) {
                int si = s.nextInt(), ri = s.nextInt();
                m[i] = new Movies();
                m[i].dataMovies(si, ri);
            }
            int curr = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (m[i].s <= x) {
                    if (m[i].r > curr) {
                        curr = m[i].r;
                    }
                }
            }
            System.out.println(curr);
        }
        s.close();
    }
}