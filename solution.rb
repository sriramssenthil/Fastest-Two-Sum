# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    map = {}

    nums.each_with_index do |num, idx|
        diff = target - num

        if map[diff]
            return [map[diff], idx]
        else
            map[num] = idx
        end
    end
end

# Runtime: 51 ms