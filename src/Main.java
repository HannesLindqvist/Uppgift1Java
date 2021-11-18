public class Main {

    public static void main(String[] args) {
       int[] unsorted = new int[args.length];



       for(int i = 0; i<args.length; i++) {
            unsorted[i] = Integer.parseInt(args[i]);

        }
        Sorter sorter = new Sorter();
       int[] sort2 = sorter.sortering(unsorted);

        for (int j : sort2) {
            System.out.print(j + " ");

        }
    }
}
