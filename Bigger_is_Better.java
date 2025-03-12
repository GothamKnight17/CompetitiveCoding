import java.util.Scanner;

public class Bigger_is_Better {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt(); String a = s.next();
            boolean flag = false;
            for(char c: a.toCharArray()){ 
                if(c!='z'){ 
                    flag = true;
                    break;
                }
            }
            if(flag){
                for(int i=0; i<n; i++){ 
                    System.out.print("z");
                }
                System.out.println();
            }else{
                System.out.println(-1);
            }
        }
        s.close();
    }
}