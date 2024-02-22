/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
 
 var twoSumJs = function(nums, target) {
    let map = new Map()
    for(let i=0; i<nums.length; i++){
        if (map.has(target - nums[i]))
            return [i, map.get(target - nums[i])]
        map.set(nums[i],i)
    }

    return ret
};

// Runtime: 30 ms
// Memory: 51.60 MB