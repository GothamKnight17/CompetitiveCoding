import java.util.Scanner;

public class Swish_Game {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(); 
        while(t-->0){
            int m = s.nextInt(), k = s.nextInt();
            String S = s.next();
            char[] mov = S.toCharArray();
            int swhCnt = 0;
            for (char c : mov) {
                if(c=='S'){
                    swhCnt++;
                }
            }
            if(swhCnt>=k){
                System.out.println(m);
            }else{
                int curSwh = 0;
                int i =0;
                for(; i<m-1; i++){ 
                    if(mov[i]=='S'){
                        curSwh++;
                    }
                }
                int req = k-curSwh;
                System.out.println(req+i);
            }
        }
        s.close();
    }
}