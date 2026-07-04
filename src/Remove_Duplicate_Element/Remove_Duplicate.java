package Remove_Duplicate_Element;

public class Remove_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 4, 2, 1, 2, 3, 1,};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            Boolean isTrue = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isTrue = true;
                    break;
                }
            }
            if (!isTrue) {
                System.out.print(" " + arr[i]);
            }
        }
    }
}