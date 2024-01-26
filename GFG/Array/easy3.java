public class easy3 {
    public static void main(String[] args) {
        easy3 e3= new easy3();
        int []arr={1,5,7,1};
        System.out.println(e3.getPairsCount(arr, 4, 6));
    }

    int getPairsCount(int[] arr, int n, int k) {
        int count = 0;

        // Create an array to store the count of each element
        int[] hash = new int[1000001];

        // Traverse the array and update the count of each element
        for (int i = 0; i < n; i++) {
            int complement = k - arr[i];
            // Check if the complement is within the valid range of the hash array
            if (complement >= 0 && complement <= 1000000) {
                count += hash[complement];
            }
            hash[arr[i]]++;
        }

        return count;
    }
}
