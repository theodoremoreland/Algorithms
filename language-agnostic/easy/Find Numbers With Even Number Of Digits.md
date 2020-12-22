Given an array nums of integers, return how many of them contain an even number of digits.


Example 1:
<pre>
Input: nums = [12,345,2,6,7896]
Output: 2
</pre>

Explanation: 
<pre>
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
</pre>

Example 2:
<pre>
Input: nums = [555,901,482,1771]
Output: 1 
</pre>

Explanation:  
Only 1771 contains an even number of digits.

Constraints:
<pre>
1 <= nums.length <= 500
1 <= nums[i] <= 10^5
</pre>

<pre><code>
/**
 * @param {number[]} nums
 * @return {number}
 */
var findNumbers = function (nums) {
    let evenDigits = 0;
    for (num of nums) {
        if (num.toString().length % 2 === 0) { evenDigits += 1; }
    }
    return evenDigits;
};
</code></pre>