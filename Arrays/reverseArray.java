
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        if(n==1){
            return ;
        }
        int r=n-1;
        int l=0;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            r--;
            l++;
        }
    }
}