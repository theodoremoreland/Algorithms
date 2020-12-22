Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:
<pre>
Input: [3,0,1]
Output: 2
</pre>

Example 2:
<pre>
Input: [9,6,4,2,3,5,7,0,1]
Output: 8
</pre>

Note:
<pre>
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
</pre>

<pre><code>
/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    for (let i = 0; i < nums.length; i++) {
        if (nums.indexOf(i) === -1) { return i; }       
    }
    return nums.length;
};
</code></pre>