package Sliding_window;

public class Variable_Sliding_Window {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int left = 0, sum = 0;
        int minDistance = Integer.MAX_VALUE;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum >= target) {
                minDistance = Math.min(minDistance, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        System.out.println(minDistance);
    }
}
