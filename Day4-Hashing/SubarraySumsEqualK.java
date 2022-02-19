// brute force  - > O(N^3);

public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end <= nums.length; end++) {
                int sum = 0;
                for (int i = start; i < end; i++)
                    sum += nums[i];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }
}

//  optimised prefix sum technique - > 

//  hashmap  o(n) space and time

public class Solution {
    public int subarraySum(int[] nums, int k) {
        
        
        int ans = 0 ;
        HashMap<Integer , Integer> map  = new HashMap<>();
        map.put(0 ,1);
        int sum = 0;
        
        for(int i = 0 ; i < nums.length  ;i++){
            sum+= nums[i];
            if(map.containsKey(sum - k)){
                ans+= map.get(sum - k);
            }
            map.put(sum , map.getOrDefault(sum , 0 )  + 1);
            
        }
        
        return ans;
    }
}