import java.util.Arrays;

public class med7{
    public static void main(String[] args) {
        int []arr={1, 5, 8, 10};
        int n=arr.length;
        int k=2;
        System.out.println(getMinDiff(arr, n, k));
    }

    static int getMinDiff(int[] arr, int n, int k) {
        int min=0, max=0, r=0;
        Arrays.sort(arr);
        r=arr[n-1]-arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>=k){
                max=Math.max(arr[i-1]+k,arr[n-1]-k);
                min=Math.min(arr[i]-k,arr[0]+k);
                r=Math.min(r,max-min);
            }
            else
                continue;
        }
        return r;
    }
}