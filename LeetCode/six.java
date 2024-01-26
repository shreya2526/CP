public class six{
    public static void main(String[] args) {
        six s = new six();
        System.out.println(s.longestPalindrome("babad"));
    }

    public String longestPalindrome(String s){
        // char[]ch = new char[128];
        // ch=s.toCharArray();
        // char[]ch1 = new char[128];
        // for(int i =0;i<ch.length;i++){
        //     ch1[i]=ch[i];
        //     for(int j =1;j<ch.length;j++){
        //         ch1[j]=ch[j];
        //         if(ch1[i]==ch[j])
        //             break;
        //     }
        // }
        // String s1 = new String(ch1);
        return s1;
    }
}
/* 
class Solution {
    public String longestPalindrome(String str) {
        
        int n=str.length();
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                dp[i][j]=1;
            }
        }
         int[] ans = new int[]{0, 0};
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                dp[i][i+1]=1;
                ans[0]=i;
                ans[1]=i+1;
            }
        }
        for(int j=2;j<n;j++){
            for(int i=0;i<n-j;i++){
                int k=i+j;
                if(str.charAt(i)==str.charAt(k)&&dp[i+1][k-1]>0){
                    dp[i][k]=1;
                    ans[0]=i;
                    ans[1]=k;
                }
            }
        }
         return str.substring(ans[0],ans[1]+1);
       
    }
}
*/