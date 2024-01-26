import java.util.ArrayList;

public class easy8 {
    public static void main(String[] args) {
        int []arr={-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int n=arr.length;
        rearrange(arr, n);
        for(int i=0;i<n;i++)
            System.out.print(" "+arr[i]);
    }
    static void rearrange(int []arr, int n){
        ArrayList<Integer> pos= new ArrayList<Integer>();
        ArrayList<Integer> neg= new ArrayList<Integer>();
        int i,j=0,k=0;
        for(i=0;i<n;i++){
            if(arr[i]>=0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }
        i=0;
        while(i<pos.size() && j<neg.size()){
            arr[k++]=pos.get(i++);
            arr[k++]=neg.get(j++);
        }
        while(i<pos.size())
            arr[k++]=pos.get(i++);
        while(j<neg.size())
            arr[k++]=neg.get(j++);
    }
}
