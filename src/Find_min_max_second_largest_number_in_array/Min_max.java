package Find_min_max_second_largest_number_in_array;

public class Min_max {
    public static void main(String[] args) {
        int[] arr = {10, 3, 22, 5, 65};
        int max = arr[0];
        int secMax = arr[0];
        int min=arr[0];
        for (int i = 1; i <=arr.length - 1; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }else if (min>arr[i]) {
                min=arr[i];
            }
            else if (arr[i]>secMax && secMax!=max) {
                secMax=arr[i];
            }
        }
        System.out.println("Here the maximum Element of arr "+max);
        System.out.println("Here the Second_maximum Element of arr "+secMax);
        System.out.println("Here the Min Element of arr "+min);

    }
}
