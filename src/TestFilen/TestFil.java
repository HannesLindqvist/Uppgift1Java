package TestFilen;
import Sorter.Sorter;
import java.util.Arrays;

public class TestFil{

    public static void main(String[] args) {
        Sorter Sårt = new Sorter();
        TestPositivaTal(Sårt);
        TestTomLista(Sårt);
        TestNegativaTal(Sårt);
    }

    private static void TestPositivaTal(Sorter Sårt) {
        int[] PosLista = {5, 2, 4, 1, 50};
        int[] resultat = Sårt.sortering(PosLista);
        int[] förväntat = {1, 2, 4, 5, 50};

        if (Arrays.equals(resultat, förväntat)) {
            System.out.println("Godkänt");
        }
    }

    private static void TestTomLista(Sorter Sårt) {
        int[] TomLista = {};
        int[] resultat = Sårt.sortering(TomLista);
        int[] förväntat = {};

        if (Arrays.equals(resultat, förväntat)) {
            System.out.println("Godkänt");
        }
    }
    private static void TestNegativaTal(Sorter Sårt) {
        int[] NegativLista = {-1, -77, -3, -1000, -30};
        int[] resultat = Sårt.sortering(NegativLista);
        int[] förväntat = {-1000, -77, -30, -3, -1};

        if (Arrays.equals(resultat, förväntat)) {
            System.out.println("Godkänt");
    }
}
}








