
class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
      int[] freq = new int[256]; // Covers extended ASCII range.
        int n = s.length(); // Get the length of the string.

        // Count the frequency of each character.
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            freq[c]++;
        }

        // Find the first character with frequency 1.
        for (int i = 0; i < n; i++) {
            if (freq[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }
        return '$';
    }
}
