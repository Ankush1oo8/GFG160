class Solution {
    public int second_largest(int[] arr) {
        // Code Here
        int n=arr.length;
        if(n==2){
            int secmax=Math.min(arr[0],arr[1]);
            return secmax;
        }
        int max=-1,secmax=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }else if(arr[i]<max){
                secmax=Math.max(arr[i],secmax);
            }
            
        }
        return secmax;
    }
}