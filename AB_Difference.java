import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;

/**
 * AB_Difference
 */
public class AB_Difference {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        System.out.print((int)Math.abs((double)(a+b-a*b)));
        s.close();
    }
}