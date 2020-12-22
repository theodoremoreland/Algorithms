Given a sorted array and a target value, return the index if the target is found.If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:
<pre>
Input: [1, 3, 5, 6], 5
Output: 2
</pre>

Example 2:
<pre>
Input: [1, 3, 5, 6], 2
Output: 1
</pre>

Example 3:
<pre>
Input: [1, 3, 5, 6], 7
Output: 4
</pre>

Example 4:
<pre>
Input: [1, 3, 5, 6], 0
Output: 0
</pre>

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function (nums, target) {

    // if number is smaller than first element, return position 0.
    if (target < nums[0]) { return 0; }

    for (let i = 0; i < nums.length; i++) {

        let num = nums[i];
        let nextNum = target;

        try { nextNum = nums[i + 1]; }
        catch { }

        if (num === target) {
            return i;
        }
        // if current number is 1 less than target 
        // and next number is greater than target 
        else if (num < target && nextNum > target) {
            return (i + 1);
        }
    }

    // if target belongs at the end of array, return the length of array
    return nums.length;
};