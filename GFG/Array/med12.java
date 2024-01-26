public class med12 {
    public static void main(String[] args) {
        int[] arr = { 0, -10, 1, 3, -20 };
        int n = arr.length;
        System.out.println(missingNumber(arr, n));
    }

    static int missingNumber(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            // Ignore non-positive numbers and numbers greater than n
            while (arr[i] > 0 && arr[i] <= size && arr[arr[i] - 1] != arr[i]) {
                // Swap the current element to its correct position
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        // Find the first index where the value is not equal to its index + 1
        for (int i = 0; i < size; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // If all numbers are in their correct positions, return n + 1
        return size + 1;
    }
}