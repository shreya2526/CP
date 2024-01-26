import java.util.Arrays;

public class med13 {
    public static void main(String[] args) {
        int[] arr = { 45, 4, 1, 6, 10, 8 };
        int n = arr.length;
        int x = 13;
        System.out.println(find3Numbers(arr, n, x));
    }

    public static boolean find3Numbers(int arr[], int n, int X) {

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];

                if (currentSum == X) {
                    // Triplet found
                    return true;
                } else if (currentSum < X) {
                    // Move the left pointer to increase the sum
                    left++;
                } else {
                    // Move the right pointer to decrease the sum
                    right--;
                }
            }
        }

        // No triplet found
        return false;
    }
}