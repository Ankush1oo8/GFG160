public class minCharoAddforPalindrome {

        public static int minChar(String s) {
            int n = s.length();
            String reversed = new StringBuilder(s).reverse().toString();
            String combined = s + "#" + reversed; // Combine original, separator, and reversed
    
            int[] lps = computeLPS(combined);
    
            // The length of the longest palindrome prefix is lps[combined.length() - 1].
            // Minimum characters to add = total length - longest palindrome prefix length.
            return n - lps[combined.length() - 1];
        }
    
        private static int[] computeLPS(String str) {
            int n = str.length();
            int[] lps = new int[n];
            int len = 0; // Length of the previous longest prefix suffix
            int i = 1;
    
            while (i < n) {
                if (str.charAt(i) == str.charAt(len)) {
                    len++;
                    lps[i] = len;
                    i++;
                } else {
                    if (len != 0) {
                        // Backtrack the length to the previous position
                        len = lps[len - 1];
                    } else {
                        lps[i] = 0;
                        i++;
                    }
                }
            }
            return lps;
        }
    
    
}
