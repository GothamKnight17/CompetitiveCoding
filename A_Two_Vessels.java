import java.util.*;

public class A_Two_Vessels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            float a = s.nextFloat(), b = s.nextFloat(), c = s.nextFloat();
            float max = 0; 
            if(a>b)
            max = a;
            else
            max = b;
            float eql = (a+b)/2;
            float ext = max - eql;
            System.out.println((int)Math.ceil(ext/c));
        }
        s.close();
    }
}