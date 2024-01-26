public class nine {
    public static void main(String[] args) {
        nine n = new nine();
        System.out.println(n.myAtoi("   133"));
    }

    public int myAtoi(String s) {
        int index = 0;
        int sign = 1;
        int result = 0;
    
        // Step 1: Ignore leading whitespace
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
    
        // Step 2: Check for sign character
        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }
    
        // Step 3: Read in characters until a non-digit character is encountered
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = Character.getNumericValue(s.charAt(index));
    
            // Step 4: Check for overflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
    
            result = result * 10 + digit;
            index++;
        }
    
        // Apply the sign
        return result * sign;
    }
    
}
