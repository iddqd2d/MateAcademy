import java.util.Arrays;

public class SortManager {
    private int[] arr;


    SortManager(int[] arr) {
        this.arr = arr;

    }


    public void bubbleSort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                int temp;
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public void selectionSort() {
        int min;
        int temp;

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


    public void doubleSelectionSort() {
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


    public void insertionSort() {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }


    public void shellSort() {
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


    public void quickSort() {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
