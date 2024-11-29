class Solution {
    public String addBinary(String s1, String s2) {
        int i = s1.length() - 1, j = s2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        // Perform addition until both strings and carry are exhausted
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry; // Start with the carry

            // Add the binary digit from s1 if available
            if (i >= 0) {
                sum += s1.charAt(i) - '0';
                i--;
            }

            // Add the binary digit from s2 if available
            if (j >= 0) {
                sum += s2.charAt(j) - '0';
                j--;
            }

            // Append the remainder (sum % 2) to the result
            result.append(sum % 2);

            // Update carry (sum / 2)
            carry = sum / 2;
        }

        // Reverse the result and remove any leading zeros
        while (result.length() > 1 && result.charAt(result.length() - 1) == '0') {
            result.deleteCharAt(result.length() - 1);
        }

        return result.reverse().toString();
    }
}