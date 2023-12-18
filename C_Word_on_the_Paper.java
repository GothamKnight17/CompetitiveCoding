import java.util.Scanner;

/**
 * C_Word_on_the_Paper
 */
public class C_Word_on_the_Paper {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            String grid[] = new String[8];
            int idx = -1;
            for (int i = 0; i < grid.length; i++) {
                grid[i] = s.next();
                if(idx==-1) { 
                    for (int j = 0; j < grid[i].length(); j++) {
                        if(grid[i].charAt(j)!='.')
                        idx = j;
                    }
                }
            }
            for (int i = 0; i < grid.length; i++) {
                char temp = grid[i].charAt(idx);
                if(temp!='.')
                System.out.print(temp);
            }
            System.out.println();
        }
        s.close();
    }
}