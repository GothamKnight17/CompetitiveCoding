import java.util.Scanner;

/**
 * Chef_in_Vaccination_Queue
 */
public class Chef_in_Vaccination_Queue {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n=s.nextInt(), p=s.nextInt(), x=s.nextInt(), y=s.nextInt();
            int[] a=new int[n], b=new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
                if(i==0){ 
                    if(a[i]==1){ 
                        b[i]=y;
                    }else{ 
                        b[i]=x;
                    }
                }else { 
                    if(a[i]==1){ 
                        b[i]=b[i-1]+y;
                    }else{ 
                        b[i]=b[i-1]+x;
                    }
                }
            }
            System.out.println(b[p-1]);
        }
        s.close();
    }
}