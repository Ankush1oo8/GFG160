class Solution {
    void nextPermutation(int[] arr) {
        // Step 1: Find the first index 'i' such that arr[i] < arr[i + 1], starting from the end
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // Step 2: If such an index is found, find the next larger element to swap
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            // Swap arr[i] and arr[j]
            swap(arr, i, j);
        }

        // Step 3: Reverse the subarray from i + 1 to the end
        reverse(arr, i + 1, arr.length - 1);
    }

    // Helper method to swap two elements in an array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper method to reverse a subarray
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
