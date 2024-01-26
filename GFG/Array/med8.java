import java.util.Arrays;

public class med8 {
    public static void main(String[] args) {
        int []arr={900, 1100, 1235};
        int []dep={1000, 1200, 1240};
        int n=arr.length;
        System.out.println(findPlatform(arr, dep, n));
    }

    static int findPlatform(int arr[], int dep[], int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platforms = 1, result = 1;
        int i = 1, j = 0;

        // Similar to merge in merge sort to process all events in sorted order
        while (i < n && j < n) {
            // If next event in sorted order is arrival, increment count of platforms needed
            if (arr[i] <= dep[j]) {
                platforms++;
                i++;
            }
            // If next event is departure, decrement count of platforms needed
            else if (arr[i] > dep[j]) {
                platforms--;
                j++;
            }

            // Update result if needed
            if (platforms > result)
                result = platforms;
        }

        return result;
    } 
}
