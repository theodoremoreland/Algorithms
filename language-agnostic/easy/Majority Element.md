Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:
<pre>
Input: [3,2,3]
Output: 3
</pre>

Example 2:
<pre>
Input: [2,2,1,1,1,2,2]
Output: 2
</pre>

<pre><code>
/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let half = nums.length / 2;
    let obj = {};
    for (let i = 0; i < nums.length; i++) {
        let num = nums[i];
        obj[num] = obj[num] === undefined ? 1 : obj[num]+= 1;
        if (obj[num] > half) { return num; }
    }
};
</code></pre>