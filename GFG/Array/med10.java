public class med10{
    public static void main(String[] args) {
        int []arr={3,4,2};
        int n=arr.length;
        System.out.println(peekElement(arr, n));
    }
    static int peekElement(int []arr, int n){
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if arr[mid] is a peak element
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
                return mid; // Index of a peak element
            }

            // If the element to the right is greater, move right
            if (mid < n - 1 && arr[mid + 1] > arr[mid]) {
                left = mid + 1;
            } else {
                // Otherwise, move left
                right = mid - 1;
            }
        }

        return 0;
    }
}