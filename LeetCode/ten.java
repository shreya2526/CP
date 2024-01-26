public class ten {
    public static void main(String[] args) {
        int n=-121;
        System.out.println(isPalindrome(n));
    }
    static boolean isPalindrome(int x) {
        String numberString = Integer.toString(x);
        char[] ch = numberString.toCharArray();
        int i=0,j=ch.length-1;
        while(i<=ch.length/2 && j>=ch.length/2){
            if(ch[i]!=ch[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}
