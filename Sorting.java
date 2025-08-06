// Sorting.java
// Demonstration of Bubble Sort in Java

import java.util.Arrays;

public class Sorting {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};
        bubbleSort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
