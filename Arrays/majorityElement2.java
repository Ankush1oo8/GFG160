import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majorityElement2 {

    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        // find frequency of each number
        for (int ele : nums)
            freq.put(ele, freq.getOrDefault(ele, 0) + 1);

        // Iterate over each key-value pair in the hash map
        for (Map.Entry<Integer, Integer> it : freq.entrySet()) {
            int ele = it.getKey();
            int cnt = it.getValue();

            // Add the element to the result, if its frequency
            // if greater than floor(n/3)
            if (cnt > n / 3)
                res.add(ele);
        }

        if (res.size() == 2 && res.get(0) > res.get(1)) {
            int temp = res.get(0);
            res.set(0, res.get(1));
            res.set(1, temp);
        }
        return res;

    }

}
