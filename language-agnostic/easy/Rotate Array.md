Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:
<pre>
Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
</pre>

Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
<pre>
Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
</pre>
Explanation: 
<pre>
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
</pre>

Note:  
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?

<pre><code>
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function (nums, k) {
    // Remove last element, add removed element to beginning of array.
    for (let i = 0; i < k; i++) {
        nums.unshift(nums.pop());
    }
};
</code></pre>