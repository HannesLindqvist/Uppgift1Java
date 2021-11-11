import java.util.Arrays;

public class SortTest {
    public static void main(String[] args){
        int [] testS = {-74, 1, -6, 3, -5,-82};
            for (int i = testS.length-1; i > 0; i--){
                Arrays.sort(testS);
                System.out.println(testS[i]);
            }
        //En testfil för att testa koden senare
    }
}
