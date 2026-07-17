package Rotate_An_array;

public class Rotate_The_Array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 21, 44, 65, 3, 11};

        int n = arr.length;
        int k = 3;
        k = k % n;

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;

        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        left = 0;
        right = k - 1;
        while (left < right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
        left = k;
        right = n-1;
        while (left < right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }

        for (int i = 0; i <=arr.length-1; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
