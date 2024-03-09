import java.util.*;
public class A_Square {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int[]x = new int[4];
            int[]y = new int[4];
            for (int i = 0; i < y.length; i++) {
                x[i]=s.nextInt();
                y[i]=s.nextInt();
            }
            int length = 0, breadth = 0;
            for (int i = 1; i < y.length; i++) {
                if(x[0]==x[i]){ 
                    length=((x[0]-x[i])*(x[0]-x[i])+(y[0]-y[i])*(y[0]-y[i]));
                    length=(int)Math.sqrt((double)length);
                }
                if(y[0]==y[i]){ 
                    breadth= ((x[0]-x[i])*(x[0]-x[i])) + ((y[0]-y[i])*(y[0]-y[i]));
                    breadth=(int)Math.sqrt((double)breadth);
                }
            }
            System.out.println(length*breadth);
        }
        s.close();
    }
}