import java.util.Arrays;

public class easy14 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 5, 7 };
        int n=arr.length;
        System.out.println(findMin(arr, n));

    }

    static int findMin(int arr[], int n) {
        Arrays.sort(arr);
        return arr[0];
    }
}
