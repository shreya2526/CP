import java.util.ArrayList;

public class med1 {
    public static void main(String[] args) {
        int []a={3,1,9,3,0};
        int n=a.length;
        int s=15;
        ArrayList<Integer> arr=subarraySum(a, n, s);
        for(Integer num:arr)
            System.out.print(" "+num);
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int left = 0, right = 0, currentSum = 0;

        while (right <= n) {
            while (currentSum > s && left < right) {
                currentSum -= arr[left];
                left++;
            }

            if (currentSum == s && left < right) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(left + 1);  // Adding 1 to convert to 1-based indexing
                result.add(right); // No need to add 1, as 'right' is inclusive
                return result;
            }

            if (right < n) {
                currentSum += arr[right];
            }

            right++;
        }

        ArrayList<Integer> notFound = new ArrayList<>();
        notFound.add(-1);
        return notFound;
    }
}
