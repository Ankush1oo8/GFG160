import java.util.HashMap;

public class countPairWithGivenSum {
    int countPairs(int arr[], int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int res=0;
        for(int i:arr){
            res+=map.getOrDefault(target-i,0);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return res;
    }
}

/*
 *     int countPairs(int arr[], int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res=0;
        for(int i:arr){
            if(i>target)continue;
            if(map.containsKey(target-i)){
                res+=map.get(target-i);
                map.put(i,map.get(i)-1);
                if(i==target-i)res-=1;
            }
        }
        return res;
    }
 */