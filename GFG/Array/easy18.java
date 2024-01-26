import java.util.ArrayList;

public class easy18 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int n=arr.length;
        int d=2;
        rotateArray(arr, n,d);
    }
    static void rotateArray(int arr[], int n, int d){
        ArrayList<Integer> a = new ArrayList<Integer>();
        int i,j;
        
        // Take modulus of d with respect to n
        d = d % n;
        
        // Store the first d elements in the ArrayList
        for(i=0; i<d; i++)
            a.add(arr[i]);
        
        // Shift the remaining elements to the left
        i = 0;
        j = d;
        while(i < n-d && j < n){
            arr[i] = arr[j];
            i++;
            j++;
        }
        
        // Copy back the elements from ArrayList to the end of the array
        j = 0;
        while(i < n && j < d){
            arr[i] = a.get(j);
            i++;
            j++;
        }
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
