<pre><code>
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    for (i in nums) {
        for (j in nums) {
            
            if (nums[i] + nums[j] == target && i != j) {return [i,j]}
        }
    }
};
</code></pre>