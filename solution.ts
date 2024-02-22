function twoSumTs(nums: number[], target: number): number[] {
    const map = {}

    for (let i in nums){
        let diff = target - nums[i]
        if (map[diff]!=undefined){
            return [map[diff],i]
        }
        map[nums[i]] =i
    }
    
    return
};