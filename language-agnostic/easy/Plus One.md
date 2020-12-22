Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
<pre>
Input: [1,2,3]
Output: [1,2,4]
</pre>
Explanation: The array represents the integer 123.

Example 2:
<pre>
Input: [4,3,2,1]
Output: [4,3,2,2]
</pre>
Explanation: The array represents the integer 4321.

<pre><code>
/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    let len = digits.length - 1;
    if (digits[0] === 0) { return [1];}
    for (let i = len; i > -1 ; i--) {
        let num = digits[i];
        if (num === 9 && i !== 0) { digits[i] = 0;}
        else if (num !== 9) { digits[i] += 1; break ;}
        else if ( i === 0 ) { digits = digits.map(() => 0); digits.unshift(1); }
        else { continue ;}
    } return digits;
};
</code></pre>