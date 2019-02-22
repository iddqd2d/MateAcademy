import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //  System.out.println(bets(1,2,2,1));
        //  System.out.println(pow(2,0));
        //  System.out.println(fibRec(100));
        //  System.out.println(factorial(1));
        //  rhombus(9);


        int[] arr = createArr(100000);
        System.out.println(Arrays.toString(arr));
        long startTime = System.currentTimeMillis();
        // bubbleSort(arr);
        // selectionSort(arr);
        // doubleSelectionSort(arr);
        // insertionSort(arr);
        // shellSort(arr);
        quickSort(arr);
        long time = System.currentTimeMillis() - startTime;
        System.out.println(time);
    }

    private static int bets(int team1, int team2, int bet1, int bet2) {
        return (team1 == bet1 && team2 == bet2) ? 2 : ((team1 / team2 == bet1 / bet2) ? 1 : 0);


    }

    private static void rhombus(int length) {
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


    private static double pow(int val, int n) {

        return (n > 0) ? val * pow(val, n - 1) : 1;
    }


    private static long fibLoop(int n) {
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


    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    private static void selectionSort(int[] arr) {
        int min, temp;

        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (arr[min] != arr[i]) {
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

        }

        System.out.println(Arrays.toString(arr));
    }


    private static void doubleSelectionSort(int[] arr) {
        int min, max, temp, length;
        length = arr.length;


        for (int i = 0; i < length; i++) {
            min = i;
            max = i;

            for (int j = 1 + i; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }

            length--;

            if (arr[min] != arr[i]) {
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

            if (arr[max] != arr[length]) {
                temp = arr[max];
                arr[max] = arr[length];
                arr[length] = temp;
            }

        }

        System.out.println(Arrays.toString(arr));
    }


    private static void insertionSort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }


    private static void shellSort(int[] arr) {
        int midle = arr.length / 2;
        while (midle >= 1) {
            for (int right = 0; right < arr.length; right++) {
                for (int c = right - midle; c >= 0; c -= midle) {
                    if (arr[c] > arr[c + midle]) {
                        int tmp = arr[c];
                        arr[c] = arr[c + midle];
                        arr[c + midle] = tmp;
                    }
                }
            }
            midle = midle / 2;
        }
        System.out.println(Arrays.toString(arr));
    }


    private static void quickSort(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}

