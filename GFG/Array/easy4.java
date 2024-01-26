import java.util.ArrayList;

public class easy4 {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        ArrayList<Integer> a = leaders(arr, n);
        for (Integer num : a)
            System.out.println(num);
    }

    static ArrayList<Integer> leaders(int arr[], int n) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxRight = arr[n - 1];
        leaders.add(maxRight);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                leaders.add(0, arr[i]);
            }
        }

        return leaders;
    }

}
