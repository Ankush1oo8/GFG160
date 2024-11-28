public class implementAtoi {

    public int myAtoi(String s) {
        // Trim leading and trailing whitespaces
        s = s.trim();
        if (s.isEmpty())
            return 0;

        int index = 0, sign = 1, result = 0;
        // Check for sign
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // Process numeric characters
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            // Check for overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;

    }
}
