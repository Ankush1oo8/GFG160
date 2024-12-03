import java.util.ArrayList;

public class searchPattern {

    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();
        int m = pat.length();
        int n = txt.length();

        // Step 1: Create the LPS array
        int[] lps = computeLPSArray(pat);

        int i = 0; // Index for txt
        int j = 0; // Index for pat

        // Step 2: Pattern matching
        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                // Found an occurrence of the pattern
                result.add(i - j); // Add 0-based index
                j = lps[j - 1]; // Use LPS to continue searching
            } else if (i < n && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1]; // Backtrack using LPS
                } else {
                    i++;
                }
            }
        }
        return result;
    }

    private int[] computeLPSArray(String pat) {
        int m = pat.length();
        int[] lps = new int[m];
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;

        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
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
