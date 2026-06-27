package LArgestNumberAtLeastTwiceOfOther;

public class LArgest_number_at_least_twice_of_other {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6};
        int max = arr[0];
        int secMax = arr[0];
        int index = 0;

        for (int i = 1; i <=arr.length - 1; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
                index = i;
            } else if (arr[i] > secMax && secMax != max) {
                secMax = arr[i];
            }
        }
        if ((secMax * 2) <= max) {
            System.out.println(index);
        }else {
            System.out.println("Not Find any Number");
        }
    }
}
