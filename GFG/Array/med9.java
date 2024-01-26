public class med9 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 3 };
        int n = arr.length;
        int[] res = findTwoElement(arr, n);
        for (int i : res)
            System.out.print(i + " ");
        System.out.println();
    }

    static int[] findTwoElement(int arr[], int n) {
        int[] result = new int[2];

        for (int i = 0; i < n; i++) {
            int absValue = Math.abs(arr[i]);
            
            if (arr[absValue - 1] > 0) {
                arr[absValue - 1] = -arr[absValue - 1];
            } else {
                result[0] = absValue; // Repeating number
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                result[1] = i + 1; // Missing number
                break;
            }
        }

        return result;
    }
}
