public class easy6 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int n = a.length;
        convertToWave(n, a);
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void convertToWave(int n, int[] a) {
        for (int i = 1; i < n; i += 2) {

            if (a[i] > a[i - 1]) {
                int temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
            }
        }
    }
}
