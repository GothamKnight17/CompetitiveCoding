import java.util.Scanner;
public class Chef_and_IPC_Certificates {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt(), m=s.nextInt(), k=s.nextInt();
        int[] t = new int[k+1];
        int count = 0;
        for(int i=0; i<n; i++){
            int time = 0;
            for (int j = 0; j < t.length; j++) {
                t[j]=s.nextInt();
            }
            for (int j2 = 0; j2 < t.length-1; j2++) {
                time+=t[j2];
            }
            if(time>=m && t[k]<=10){ 
                count++;
            }
        }
        System.out.println(count);
        s.close();
    }
}