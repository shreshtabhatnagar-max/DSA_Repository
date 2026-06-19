public class Shift_All_Zero_AtEnd {
    public static void main(String[] args) {


        int[] arr = {2, 0, 1, 0, 6, 0, 4, 0, 9};
        int n = arr.length;
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[p] = arr[i];
                p++;
            }

        }
        while (p < arr.length) {
            arr[p] = 0;
            p++;
        }
        for (int num : arr)
            System.out.print(" " + num);

    }
}
