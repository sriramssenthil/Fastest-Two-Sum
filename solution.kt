class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>(nums.size)

        for((i, value) in nums.withIndex()){
            val diff = target - value
            map[diff] ?.let {
                return intArrayOf(it, i)
            }
            map[value] = i
        }

        return intArrayOf()

    }
}