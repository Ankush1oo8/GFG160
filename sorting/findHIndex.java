public class findHIndex {
    public static int hIndex(int[] citations) {
        // Step 1: Sort the citations array in descending order
        Arrays.sort(citations);
        
        // Step 2: Find the largest index where citations[i] >= i + 1
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            if (citations[n - 1 - i] < i + 1) {
                return i;
            }
        }
        return n;
    }
}
