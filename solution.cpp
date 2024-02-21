#include <vector>
#include <unordered_map>

class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        std::unordered_map<int, int> map;

        for(int i=0;i<nums.size();i++){
            if(map.find(target - nums[i]) != map.end()){
                return {map[target - nums[i]],i};
            }
            map[nums[i]]=i; 
        }
        return {};
    } 
};

// Runtime: 3 ms
// Memory: 14.16 MB

