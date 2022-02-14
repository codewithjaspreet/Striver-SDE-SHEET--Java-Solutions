
// Brute force : O(n) space O(N) time;

import java.util.*;
class Solution {
        public int findDuplicate(int[] nums) {
            int ans = 0;
            HashMap<Integer,Integer> hm = new HashMap<>();
            
            for(int i = 0 ; i  < nums.length ; i++){
                
                if(hm.containsKey(nums[i])){
                    hm.put(nums[i] ,hm.get(nums[i]) + 1 );
                }
                else{
                    hm.put(nums[i] , 1);
                }
            }
            
            for(int a : hm.keySet()){
                
                if(hm.get(a) > 1){
                    ans =  a;
                    break;
                }
            }
            
            return ans;
            
        }
        
        // Optimised - > Linked list cycle method
        public int findDuplicate1(int[] nums) {
         
            int slow = nums[0];
            int fast = nums[0];
            
            do {
             
              slow = nums[slow];
              fast = nums[nums[fast]];
              
            }
            
            while(slow != fast);
            
            
            fast = nums[0];
            while(slow != fast){
                slow = nums[slow];
                
                fast = nums[fast];
                
            }
            
            return slow;
        
        }
    }  
