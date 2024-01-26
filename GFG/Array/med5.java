public class med5 {
    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 2, 3};
        int N1 = arr1.length;
        System.out.println(majorityElement(arr1, N1));

        // Example 2
        int[] arr2 = {3, 1, 3, 3, 2};
        int N2 = arr2.length;
        System.out.println(majorityElement(arr2, N2));
    }

    static int majorityElement(int a[], int size)
    {
        int candidate = findCandidate(a, size);

        int count = 0;
        for (int num : a) {
            if (num == candidate) {
                count++;
            }
        }

        return (count > size / 2) ? candidate : -1;
    }
    private static int findCandidate(int[] a, int N) {
        int count = 1;
        int candidate = a[0];

        for (int i = 1; i < N; i++) {
            if (a[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = a[i];
                count = 1;
            }
        }

        return candidate;
    }
}
