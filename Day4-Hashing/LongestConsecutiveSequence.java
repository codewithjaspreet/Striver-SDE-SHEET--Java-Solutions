// sorting  - onlogn & o1 space

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                if (nums[i] == nums[i-1]+1) {
                    currentStreak += 1;
                }
                else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        return Math.max(longestStreak, currentStreak);
    }

    // optimised  - > hashMap ; 
    // boolean integer , map 

        public int longestConsecutive(int[] nums) {
            
          
          HashMap<Integer , Boolean> map = new HashMap<>();
          
          // set all true 
          for(int val : nums){
            map.put(val , true);
          }
          

          // only consider them which can be a starting point for sequence

          for(int val : nums){
            if(map.containsKey(val - 1)){
              map.put(val , false);
            }
          }
          
          
          // compute length for each starting point

          int max = 0;
          for(Integer key : map.keySet()){
            if(map.get(key) == true){
              max = Math.max(max , findLength(map , key));
            }
          }
          return max;
         
        }

        // method computing length
        
       private static int findLength(HashMap<Integer , Boolean> hm , int k){
         int ans = 0;
         while(hm.containsKey(k)){
           ans++;
           k++;
         }
         return ans;
         
       }
    }
