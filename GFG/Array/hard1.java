import java.util.Arrays;

public class hard1{
    public static void main(String[] args) {
        long[] array1 = {1, 10, 3, 11, 6, 15};
        int n = array1.length;
        System.out.println(smallestpositive(array1, n));
    }
    static long smallestpositive(long[] array, int n){ 
        Arrays.sort(array);

        long result = 1;

        for (int i = 0; i < n && array[i] <= result; i++) {
            result += array[i];
        }

        return result; 
    }
}