import java.util.Random;

/**
 * Created by Toshiba on 21.02.2015.
 */
public class RandomNumbers {
    Random rand = new Random();

    public int[] arrRandom()     {
        int arrNumbers[] = new int[6] ;
        Random rd = new Random() ;
        for(int i = 0;i<6;i++) {
            arrNumbers[i] =  rd.nextInt(49);
        }
        return arrNumbers;
    }

}
