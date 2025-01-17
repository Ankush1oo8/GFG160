class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
       int n = arr.length;
        

        int[] res = new int[n];
        Arrays.fill(res, 1);
        
  
        int prefixProduct = 1;
        for (int i = 0; i < n; i++) {
            res[i] = prefixProduct;
            prefixProduct *= arr[i];
        }
        
      
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suffixProduct;
            suffixProduct *= arr[i];
        }
        
        return res;
    }
}