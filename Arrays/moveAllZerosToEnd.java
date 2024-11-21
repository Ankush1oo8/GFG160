
class Solution {
    void pushZerosToEnd(int[] arr) {
        int l=0,r=0;
        while(r<arr.length){
            if(arr[r]!=0){
                if(l!=r){
                    int temp=arr[l];
                    arr[l]=arr[r];
                    arr[r]=temp;
                }
                l++;
            }
            r++;
        }
    }
}