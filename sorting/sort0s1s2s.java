package sorting;

public class sort0s1s2s {
    public void swap(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int low = 0, mid = 0, high = arr.length - 1; 

        while (mid <= high) {
            if(arr[mid]==0){
                swap(arr,low,mid);
                mid++;
                low++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,high,mid);
                high--;
                
            }
        }
    }
}
