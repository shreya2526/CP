import java.util.ArrayList;

public class med4 {
    public static void main(String[] args) {
       int []arr={0,1,0};
        int n=arr.length;
        sort012(arr, n);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" "); 
    }    
    public static void sort012(int a[], int n)
    {
        ArrayList<Integer> a0 = new ArrayList<Integer>();         
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(a[i]==0)
                a0.add(a[i]);
            else if(a[i]==1)
                a1.add(a[i]);
            else if(a[i]==2)
                a2.add(a[i]);
        }
        int i=0, k=0, j=0;
        while(i<n){
            if(i<a0.size()){
                a[i]=a0.get(i);
            }
            else if(i>=a0.size() && i<a0.size()+a1.size()){
                a[i]=a1.get(k);
                k++;
            }
            else if(i>=a0.size()+a1.size()){
                a[i]=a2.get(j);
                j++;
            }
            i++;
        }
    }
/* 
    public static void sort012(int[] arr, int N) {
        int low = 0, high = N - 1, mid = 0;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
*/
}
