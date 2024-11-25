
class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int maxProduct = arr[0];

        int minProduct = arr[0];

        int answer = arr[0];

        for (int i = 1; i < arr.length; ++i) {

            int currentMax = maxProduct;

            int currentMin = minProduct;

            maxProduct = Math.max(arr[i], Math.max(currentMax * arr[i], currentMin * arr[i]));

            minProduct = Math.min(arr[i], Math.min(currentMax * arr[i], currentMin * arr[i]));

            answer = Math.max(answer, maxProduct);

        }

        // Return the largest product of any subarray found.

        return answer;
    }
}