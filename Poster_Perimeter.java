import java.util.Scanner;

public class Poster_Perimeter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt(), m = s.nextInt(), k = s.nextInt();
            int maxP = 2*(n+m);
            if(maxP<=k){
                System.out.println(k-maxP);
            }else{
                int minDiff = Integer.MAX_VALUE;
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= m; j++) {
                        int currP = 2*(i+j);
                        int currDif = Math.abs(k-currP);
                        minDiff = Math.min(currDif, minDiff);
                    }
                }
                System.out.println(minDiff);
            }
        }
        s.close();
    }
}