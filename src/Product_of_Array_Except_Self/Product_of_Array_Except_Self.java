package Product_of_Array_Except_Self;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = 4;
        int[] pre = new int[n];
        int target = 1;
        for(int i=0;i<=arr.length-1;i++)
        {
            target*=arr[i];
        }
        for(int i=0;i<=arr.length-1;i++)
        {
            pre[i]=target/arr[i];
        }

        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(" "+pre[i]);
        }
    }
}
