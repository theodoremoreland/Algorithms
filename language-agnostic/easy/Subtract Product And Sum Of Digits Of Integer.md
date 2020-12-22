Given an integer number n, return the difference between the product of its digits and the sum of its digits.


Example 1:
<pre>
Input: n = 234
Output: 15 
</pre>
Explanation:  
<pre>
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
</pre>

Example 2:
<pre>
Input: n = 4421
Output: 21
</pre>

Explanation:  
<pre>
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
</pre>


Constraints:  
1 <= n <= 10^5

<pre><code>
/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function (n) {
    let digits = [...n.toString()];
    let product = digits.reduce((accu, currentValue) => parseInt(accu) * parseInt(currentValue));
    let sum = digits.reduce((accu, currentValue) => parseInt(accu) + parseInt(currentValue));
    return product - sum;
};
</code></pre>