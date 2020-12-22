Given an array of integers, find if the array contains any duplicates.
Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:
<pre>
Input: [1,2,3,1]
Output: true
</pre>

Example 2:
<pre>
Input: [1,2,3,4]
Output: false
</pre>

Example 3:
<pre>
Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
</pre>

<pre><code>
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    for (i in nums) {
        let num = nums[i];
        delete nums[i];
        if (!nums.includes(num)) { nums[i] = num; }
        else { return true; }
    } return false;
};
</code></pre>