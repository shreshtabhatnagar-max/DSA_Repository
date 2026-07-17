package Bubble_Sort;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 2, 10, 3, 4};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; i++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            for (int num : arr) {
                System.out.print(" " + num);
            }
        }
    }
}
