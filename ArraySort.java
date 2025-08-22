import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int min, temp;
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            System.out.println("Array after iteration " + (i + 1) + ": " + Arrays.toString(arr));
        }

        System.out.println("\nSorted Array: " + Arrays.toString(arr));
    }
}
