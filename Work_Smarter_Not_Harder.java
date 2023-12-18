import java.util.*;
class Work_Smarter_Not_Harder{ 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  t = s.nextInt();
        while (t--!=0) {
            int l = s.nextInt();
            int v1=s.nextInt(), v2=s.nextInt();
            int t_t = (int)Math.ceil((double)l/v1);
            int t_h = (int)Math.ceil((double)l/v2);
            if (t_t - t_h <= 0) {
                System.out.println(-1);
            }
            else{
                int count=0; 
                for (int i = t_h; i < t_t; i++) {
                    count++;
                }
                System.out.println(count-1);
            }
        }
        s.close();
    }
}