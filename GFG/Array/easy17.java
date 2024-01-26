import java.util.Arrays;

public class easy17{
    public static void main(String[] args) {
        int []arr={10, 5, 10};
        int n=arr.length;
        System.out.println(secondHighest(arr, n));
    }
    static int secondHighest(int arr[], int n){
        if (n < 2) {
            return -1; // Not enough elements in the array
        }

        Arrays.sort(arr);

        int firstLargest = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < firstLargest) {
                return arr[i];
            }
        }

        return -1; // If there is no distinct second largest element
    }
}