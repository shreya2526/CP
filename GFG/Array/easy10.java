import java.util.ArrayList;

public class easy10 {
    public static void main(String[] args) {
        int []arr={-5, 7, -3, -4, 9, 10, -1, 11};
        int n=arr.length;
        segregateElements(arr, n);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    public static void segregateElements(int arr[], int n)
    {
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        int i,k=0;
        for(i=0;i<n;i++){
            if(arr[i]>=0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }
        i=0;
        while(i<pos.size()){
            arr[i]=pos.get(i);
            i++;
        }
        i=0;
        k=pos.size();
        while(i<neg.size()){
            arr[k]=neg.get(i);
            k++;
            i++;
        }
    }
}
