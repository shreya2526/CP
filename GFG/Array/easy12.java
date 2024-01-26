public class easy12 {
    public static void main(String[] args) {
        int []arr={10, 22, 28, 29, 30, 40};
        int x=54;
        int []a=new int[2];
        a=sumClosest(arr,x);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    static int[] sumClosest(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int closestSum = Integer.MIN_VALUE;
        int[] result = new int[2];

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (Math.abs(currentSum - x) < Math.abs(closestSum - x)) {
                /*The 'Math.abs()' function in Java (and in many programming languages) is used to calculate the absolute value of a numeric expression. The absolute value of a number is its distance from zero on the number line, regardless of direction. In other words, it gives the magnitude of a number without considering its sign.*/
                closestSum = currentSum;
                result[0] = arr[left];
                result[1] = arr[right];
            }

            if (currentSum < x) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
