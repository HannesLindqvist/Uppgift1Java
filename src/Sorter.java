import java.util.Arrays;
import java.util.Random;

public class Sorter {
    public static int[] sor(){


        int [] array = new int [10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(-100, 100) +1;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        return array;

    }
}



