
class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    private int max(int[] arr) {

        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        // Traverse the array
        for (int i = 1; i < arr.length; i++) {

            maxEndingHere = Math.max(maxEndingHere + arr[i], arr[i]);

            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    private int min(int[] arr) {

        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        // Traverse the array
        for (int i = 1; i < arr.length; i++) {

            maxEndingHere = Math.min(maxEndingHere + arr[i], arr[i]);

            maxSoFar = Math.min(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    private int total(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max += arr[i];
        }
        return max;
    }

    public int circularSubarraySum(int arr[]) {

        // Your code here
        int totalSum = total(arr);
        int max = max(arr);
        int min = min(arr);
        int maxi = totalSum - min;
        if (max > 0)
            return Math.max(maxi, max);
        return max;

    }
}
