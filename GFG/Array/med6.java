import java.util.Arrays;

public class med6 {
    public static void main(String[] args) {
        int []arr={7, 10, 4, 20, 15};
        int l=0, r=arr.length-1;
        int k=4;
        //System.out.println(r);
        System.out.println(kthSmallest(arr, l, r, k));
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        return arr[k - 1];
    } 
}
