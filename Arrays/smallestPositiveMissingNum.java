public class smallestPositiveMissingNum {

        // Function to find the smallest positive number missing from the array.
        public int missingNumber(int[] arr) {
            // Your code here
          HashSet<Integer>s=new HashSet<>();
          for (int n:arr){
              if(n>0){
                  s.add(n);
              }
          }
          int missing =1;
          while(s.contains(missing)){
              missing++;
          }
          return missing;
        }
    
}
