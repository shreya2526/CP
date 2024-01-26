public class one {
    int nums[] = { 2, 11, 7, 15 };

    public static void main(String[] args) {

        one o = new one();

        int[] arr = new int[2];
        o.solution(arr, 9);

    }

    void solution(int sol[], int target) {

        sol = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[i] + nums[j + 1] == target) {
                    sol[i] = i;
                    sol[i + 1] = j + 1;
                    break;
                }
            }
        }
        System.out.println("output indices are:");
        for (int i = 0; i < sol.length; i++)
            System.out.print(sol[i] + " ");
    }
}

//using map

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             int cur=nums[i];
//             int x = target-cur;
//             if(map.containsKey(x)){
//                 return new int[]{map.get(x),i};
//             }
//             map.put(cur,i);
//         }
//         return null;
//     }
// }