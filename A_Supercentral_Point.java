import java.util.Scanner;

public class A_Supercentral_Point {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] x = new int[n], y = new int[n];
        for (int i = 0; i < y.length; i++) {
            x[i] = s.nextInt();
            y[i] = s.nextInt();
        }
        int count = 0;
        int[] temp = new int[4];
        for (int j = 0; j < temp.length; j++) {
           temp[j] = -1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (x[j] > x[i] && y[j] == y[i])
                    temp[0]=1;
                else if (x[j] < x[i] && y[j] == y[i])
                    temp[1]=1;
                else if (x[j] == x[i] && y[j] < y[i])
                    temp[2]=1;
                else if (x[j] == x[i] && y[j] > y[i])
                    temp[3]=1;
            }
            if(temp[0]==1 && temp[1]==1 && temp[2]==1 && temp[3]==1)
            count++;

            for (int j = 0; j < 4; j++) {
                temp[j]=0;
            }
        }
        System.out.println(count);
        s.close();
    }
}