// Moore's Voting Algorithm
// O(N) time & O(1) space
class Solution {
    public int MajorityElement1(int[] nums) {
        
        int ansIndex = 0; 
        int count = 1;
        
        for(int i  = 0 ; i < nums.length ; i++){
            
            if(nums[i] == nums[ansIndex]){
                count++;
            }
            else{
                count--;
            }
            
            if(count == 0){
                ansIndex = i;
                count = 1;
            }
        }
        
        int c= 0;
        for(int i = 0 ; i < nums.length ;i++){
            
            if(nums[i] == nums[ansIndex]){
                c++;
            }
        }
        if(c > nums.length / 2){
            return nums[ansIndex];
        }
        
        return 0;
    }
}