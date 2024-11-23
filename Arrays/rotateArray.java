public class rotateArray {

    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;

        // Edge case: If the array has only one element or no rotation needed
        if (n <= 1 || d <= 0) {
            return;
        }

        // Normalize d in case it's greater than or equal to array length
        d = d % n;

        // Step 1: Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse the remaining elements
        reverse(arr, d, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    // Helper function to reverse elements in the array
    private static void reverse(int arr[], int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
