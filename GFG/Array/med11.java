public class med11 {
    public static void main(String[] args) {
        int []arr={6, -3, -10, 0, 2};
        int n=arr.length;
        System.out.println(maxProduct(arr,n));
    }

    static long maxProduct(int[] arr, int n){
        if (n == 0) {
            return 0;
        }

        long maxProduct = arr[0];
        long minProduct = arr[0];
        long result = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < 0) {
                // Swap max and min products
                long temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
