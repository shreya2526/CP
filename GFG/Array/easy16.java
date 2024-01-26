public class easy16 {
    public static void main(String[] args) {
        int []arr={1,1,1,1,1};
        int x=1;
        System.out.println(findFrequency(arr,x));
    }
    static int findFrequency(int A[], int x){
        int count=0;
        for(int i=0;i<A.length;i++){
            if(x==A[i])
                count++;
        }
        return count; 
    }
}
