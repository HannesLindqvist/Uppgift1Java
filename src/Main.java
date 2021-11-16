import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        int[] num = new int[args.length];


        for(int i = 0; i<args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);

        }
    }
}
