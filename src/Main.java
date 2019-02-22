import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(bets(3, 2, 3, 0));
        //  System.out.println(pow(2,0));
        //  System.out.println(fibEffective(100));
        //  System.out.println(fibRec(100));
        //  System.out.println(factorial(1));
        //  drawRomb(9);


        int[] arr = createArr(100000);
        System.out.println(Arrays.toString(arr));
        SortManager sm = new SortManager(arr);
        long startTime = System.currentTimeMillis();
        // sm.bubbleSort();
        // sm.selectionSort();
        // sm.doubleSelectionSort();
        // sm.insertionSort();
        // sm.shellSort();
        // sm.quickSort();
        long time = System.currentTimeMillis() - startTime;
        System.out.println(time);
    }

    private static int bets(int team1, int team2, int bet1, int bet2) {
        return (team1 == bet1 && team2 == bet2) ? 2 : (((team1 > team2 && bet1 > bet2) | (team1 < team2 && bet1 < bet2)) ? 1 : 0);


    }

    private static void drawRomb(int length) {
        int center = length / 2;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int module = Math.abs(center - i);
                if (j >= module & j < length - module)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();

        }


    }


    private static int pow(int val, int n) {

        return (n > 0) ? val * pow(val, n - 1) : 1;
    }


    private static long fibEffective(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }


    private static long fibRec(int n) {
        if (n <= 1)
            return n;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    private static long factorial(int n) {
        return (n > 0) ? n * factorial(n - 1) : 1;
    }


    private static int[] createArr(int n) {
        int[] arr = new int[n];
        while (--n >= 0) {
            arr[n] = new Random().nextInt(99);
        }
        return arr;
    }


}

