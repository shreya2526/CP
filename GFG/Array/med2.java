public class med2{
    public static void main(String[] args) {
        int []arr={1,2,3,-2,5};
        int n=arr.length;
        System.out.println(maxSubarraySum(arr,n));
    }
    static long maxSubarraySum(int arr[], int n){
        
        long maxSum = Integer.MIN_VALUE;
        long currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}