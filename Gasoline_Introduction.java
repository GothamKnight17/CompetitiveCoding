import java.util.Scanner;
public class Gasoline_Introduction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int n=s.nextInt();
            int[] f=new int[n];
            for (int i = 0; i < f.length; i++) {
                f[i]=s.nextInt();
            }
            int dis = 0, i=1, oil =f[0];
            while (oil>=1 && i<f.length)  {
                oil+=f[i]-1;
                i++;
            }
            dis=i+oil;
            System.out.println(dis-1);
        }
        s.close();
    }
}