import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class overlappingInterval {
     public List<int[]> mergeOverlap(int[][] arr) {
        int n = arr.length; // size of the array
        
        // Sort the given intervals based on the starting values
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // If the result list is empty or the current interval does not overlap with the last interval
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1)[1]) {
                ans.add(arr[i]); // Add the current interval to the result list
            } else {
                // Merge the current interval with the last interval
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], arr[i][1]);
            }
        }
        
        return ans; // Return the merged intervals as an array list of int[]
    }
}
