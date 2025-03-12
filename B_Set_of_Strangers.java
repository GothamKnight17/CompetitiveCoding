import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class B_Set_of_Strangers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt(), m = s.nextInt(), a[][] = new int[n][m];

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = s.nextInt();
                }
            }

            if (m * n == 1) {
                System.out.println(0);
                continue;
            }

            HashMap<Integer, HashSet<Point>> map = new HashMap<>();

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if(map.get(a[i][j]) == null)
                       map.put(a[i][j], new HashSet<Point>());
                    else
                       map.get(a[i][j]).add(new Point(i, j));
                }
            }
            int count = 0;
            for (Map.Entry<Integer, HashSet<Point>> entry : map.entrySet()) {
                HashSet<Point> set = entry.getValue();
                // for(Point p : set){
                //     if(set.contains(new Point(p.x+1, p.y)) || set.contains(new Point(p.x, p.y+1))){
                //         count++;
                //     }
                // }
                System.out.println();
            }
            // int temp = (n*m - (count-1));
            // int ans = count+1 + temp/2;
            // System.out.println(ans);
        }
        s.close();
    }
}