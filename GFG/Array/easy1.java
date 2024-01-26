class easy1{
    public static void main(String[] args) {
        int []array={2,3,4,5};
        int n=5;
        easy1 e = new easy1();
        System.out.println(""+e.missingNumber(array,n));
    }

    int missingNumber(int arr[], int n){
        int i, res=0;
        for(i=0;i<=n;i++)
            res^=i;
        for(i=0;i<n-1;i++)
            res^=arr[i];
        return res;
    }

}