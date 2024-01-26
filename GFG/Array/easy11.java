import java.util.HashMap;

public class easy11 {
    public static int firstNonRepeating(int arr[], int n) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int currentElement = arr[i];
            frequencyMap.put(currentElement, frequencyMap.getOrDefault(currentElement, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            int currentElement = arr[i];
            if (frequencyMap.get(currentElement) == 1) {
                return currentElement;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // Example 1
        int arr1[] = {-1, 2, -1, 3, 2};
        int n1 = arr1.length;
        System.out.println("Output for Example 1: " + firstNonRepeating(arr1, n1));

        // Example 2
        int arr2[] = {1, 1, 1};
        int n2 = arr2.length;
        System.out.println("Output for Example 2: " + firstNonRepeating(arr2, n2));
    }
}
