import java.util.Arrays;

public class TestFil{
    public static void main(String[] args) {
        Sorter Sårt = new Sorter();
        int[] lista1 = {5, 2, 4, 1, -4};

        sorteraLista(Sårt, lista1);

    }
    private static void sorteraLista(Sorter Sårt, int[] lista1) {
        int[] resultat = Sårt.sortering(lista1);
        for (int i = 0; i <lista1.length ; i++) {
            System.out.print(lista1[i] + ", ");

        }
        int[]förväntat={-4, 1, 2, 4, 5};
        for(int i = 0; i < förväntat.length; i++){

        }
        if(Arrays.equals(resultat,förväntat)){
            System.out.println("Godkänt");
        }else {
            System.out.println("Error:Fick" + Arrays.toString(resultat) + "Förväntademig:" + Arrays.toString(förväntat));
        }

    }

}






