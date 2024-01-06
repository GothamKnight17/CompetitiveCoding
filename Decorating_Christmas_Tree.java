import java.util.*;
public class Decorating_Christmas_Tree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int n = s.nextInt(), x = s.nextInt(), y = s.nextInt();
            if((x-(y/3))>=0){ 
                int temp =x-(y/3);
                n-=(y/3);
                if(n<=temp/2){ 
                    System.out.println("YES");
                }
                else{ 
                    System.out.println("NO");
                }
            }else{ 
                if(x>=n || x/2>=n)
                System.out.println("YES");
                else{ 
                    System.out.println("NO");
                }
            }
        }
        s.close();
    }
}