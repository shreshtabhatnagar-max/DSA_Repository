package Two_Sum;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("The Target Value is equals to " + arr[left] + " " + arr[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }


    }
}
