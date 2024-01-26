public class easy7 {
    public static void main(String[] args) {
       int []arr={1, 5, 3, 4, 3, 5, 6};
       int n=arr.length;
       System.out.println(firstRepeated(arr, n)); 
    }

    public static int firstRepeated(int[] arr, int n) {
        int MAX = 1000001;
        int[] index = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            index[i] = -1;
        }

        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (index[arr[i]] != -1) {
                minIndex = Math.min(minIndex, index[arr[i]]);
            } else {
                index[arr[i]] = i + 1; // Using 1-based indexing
            }
        }

        if (minIndex == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minIndex;
        }
    }
}
