// User function Template for Java
class Solution {
    int maxSubarraySum(int[] arr) {
        // Initialize variables
        int maxSoFar = arr[0];    // Stores the global maximum subarray sum
        int maxEndingHere = arr[0]; // Stores the maximum subarray sum ending at the current index
        
        // Traverse the array
        for (int i = 1; i < arr.length; i++) {
            // Update the maximum subarray sum ending at the current index
            maxEndingHere = Math.max(maxEndingHere + arr[i], arr[i]);
            
            // Update the global maximum if the current subarray sum is greater
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }
}
