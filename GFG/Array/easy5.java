public class easy5{
    public static void main(String[] args) {
        long []arr={1,3,5,2,2};
        int n=5;
        System.out.println(equillibrium(arr, n));
    }

    public static int equillibrium(long []arr, int n){
        long totalSum = 0;
        long leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return i + 1;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}