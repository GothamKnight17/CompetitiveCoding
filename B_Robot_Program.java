import java.util.Scanner;

public class B_Robot_Program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int x = s.nextInt(), k = s.nextInt();
            String str = s.next();
            int pos = 0, t1 = 0, t2 = 0, count = 0, ti = k;
            for(int i=0; ti<=0;i++){ 
                if(i == n){
                    break;
                }
                // pos += (str.charAt(i) == 'L') ? -1 : 1;
                if(t1 == 0 && pos == x){
                    t1 =  i;
                    count++;
                }
                if(t1 != 0 && t2 == 0 && pos == 0){
                    t2 = i;
                    count++;
                }
                if(t1 != 0 && t2 != 0){
                    break;
                }
                ti--;
            }
            if(ti==0){ 
                System.out.println(count);
                continue;
            }
            count += (k - t1)/t2;
            System.out.println(count);
        }
        s.close();
    }
}