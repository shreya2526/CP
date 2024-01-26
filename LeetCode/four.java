public class four {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] charIndex = new int[128]; // Assuming ASCII characters

        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            if (charIndex[currentChar] > 0) {
                left = Math.max(left, charIndex[currentChar]);
            }

            charIndex[currentChar] = right + 1;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        four f = new four();
        String s1 = "abcabcbb";
        System.out.println(f.lengthOfLongestSubstring(s1)); // Output: 3

        String s2 = "bbbbb";
        System.out.println(f.lengthOfLongestSubstring(s2)); // Output: 1

        String s3 = "pwwkew";
        System.out.println(f.lengthOfLongestSubstring(s3)); // Output: 3

        //f.lengthOfLongestSubstring(s1);
    }
}
