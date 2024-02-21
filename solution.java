    class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int j = 1;
        
        while(j<nums.length){
            for(int i=0; i+j<nums.length; i++){
                if(nums[i]+nums[i+j]==target){
                    res[0]= i;
                    res[1]= i+j;
                    return res;
                }
            }
            j++;
        }
        return res;
    }
}

// Runtime: O ms
// Memory; 45.02 MB
