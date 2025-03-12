import java.util.Scanner;

public class B_Gorilla_and_the_Exam {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[] a = new int[n];
            int[] cnt = new int[(int) (Math.pow(10, 9)+1)];
            for(int i=0; i<a.length; i++) { 
                a[i] = s.nextInt();
                cnt[a[i]]++;
            }
            int max = 0, idx=-1;
            for(int i=0; i<cnt.length; i++) {
                if(cnt[i]>max) {
                    max = cnt[i];
                    idx = i;
                }
            }
            int x=k;
            for(int i=0; i<n && k>0; i++) {
                if(i==idx) {
                    cnt[idx]+=x;
                }else{
                    if(cnt[i]-k>=0) {
                        cnt[i]-=k;
                        k=0;
                    }else{
                        k-=cnt[i];
                        cnt[i]=0;
                    }
                }
            }
            int mov = 0;
            for (int i2 : cnt) {
                if(i2>0) {
                    mov++;
                }
                
            }
            System.out.println(mov);
        }
        s.close();
    }
}