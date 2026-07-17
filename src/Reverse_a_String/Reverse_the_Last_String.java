package Reverse_a_String;

public class Reverse_the_Last_String {
    public static void main(String[] args) {
        String str = "Hello  this is world";
        char[] ss = str.toCharArray();

        int left = ss.length - 1;

        while (left >= 0 && ss[left] != ' ') {
            left--;
        }
        left++;
        int right = ss.length - 1;
        while (left < right) {
            char temp = ss[right];
            ss[right]=ss[left];
            ss[left]=temp;
            left++;
            right--;
        }
        System.out.println(ss);
    }
}
