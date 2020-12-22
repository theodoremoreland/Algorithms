<pre><code>
/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    for (let i = 0; i < nums.length; i++) {
        let num = nums[i];
        delete nums[i];
        if (!nums.includes(num)) { return num; }
        nums[i] = num;
    }
};
</code></pre>