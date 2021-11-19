package TestFilen;
import Sorter.Sorter;
import java.util.Arrays;

public class TestFil{

    public static void main(String[] args) {
        Sorter Sårt = new Sorter();
        TestPositivaTal(Sårt);
        TestTomLista(Sårt);

    }
    private static void TestPositivaTal(Sorter Sårt) {
        int[] lista1 = {5, 2, 4, 1, 50};
        int[] resultat = Sårt.sortering(lista1);
        int[] förväntat = {1, 2, 4, 5, 50};

        if (Arrays.equals(resultat, förväntat)) {
            System.out.println("Godkänt");
        }
    }

    private static void TestTomLista(Sorter Sårt) {
        int[] lista1 = {};
        int[] resultat = Sårt.sortering(lista1);
        int[] förväntat = {};

        if (Arrays.equals(resultat, förväntat)) {
            System.out.println("Godkänt");
        }




}
    }







