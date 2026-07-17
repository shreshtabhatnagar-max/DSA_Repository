package Sliding_window;

public class Fixed_size {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int left = 0;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            if ( right -left + 1 == k) {

                minSum=Math.min(sum,minSum);
                  sum-=arr[left];
                  left++;
            }
        }
        System.out.println(minSum);
    }
}
