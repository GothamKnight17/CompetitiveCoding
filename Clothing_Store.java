import java.util.Scanner;

public class Clothing_Store {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int x1 = s.nextInt(), y1 = s.nextInt(), z1 = s.nextInt();
            int a1 = s.nextInt(), b1 = s.nextInt(), c1 = s.nextInt();
            int x2 = x1, y2 = y1, z2 = z1;  
            int a2 = a1, b2 = b1, c2 = c1;
            int total1 = 0;
            if (z1 >= c1) {
                total1 += c1;
                z1 -= c1;
                y1 += z1;
            } else {
                total1 += z1;
                z1 = 0;
            }
            if (y1 >= b1) {
                total1 += b1;
                y1 -= b1;
                x1 += y1;
            } else {
                b1 -= y1;
                total1 += y1;
                y1 = 0;
            }
            if (x1 >= a1) {
                total1 += a1;
                x1 -= a1;
            } else {
                a1 -= x1;
                total1 += x1;
                x1 = 0;
            }

            int total2 = 0;
            if (z2 >= c2) {
                total2 += c2;
                z2 -= c2;
                x2 += z2;
            } else {
                total2 += z2;
                z2 = 0;
            }
            if (y2 >= b2) {
                total2 += b2;
                y2 -= b2;
                x2 += y2;
            } else {
                b2 -= y2;
                total2 += y2;
                y2 = 0;
            }
            if (x2 >= a2) {
                total2 += a2;
                x2 -= a2;
            } else {
                a2 -= x2;
                total2 += x2;
                x2 = 0;
            }


            System.out.println(total1>total2?total1:total2);
        }
        s.close();
    }
}