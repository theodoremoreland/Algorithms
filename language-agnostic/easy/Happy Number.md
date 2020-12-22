Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 
<pre>
Input: 19
Output: true
</pre>

Explanation: 
<pre>
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
</pre>

<pre><code>
/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function (n) {

    // There is a pattern of the sum either being 1 or 145
    // Given the pattern induced by the input received by L33tcode,
    // the below algorithm loops until hitting either 1 or 145.
    let sum = 0;
    let numberString = n.toString();

    do {

        sum = 0;

        for (num of numberString) {
            num = parseInt(num);
            sum += num * num;
        }

        numberString = sum.toString();


    } while (sum !== 1 && sum !== 145);


    if (sum === 1) { return true; }
    else { return false; }
};
</code></pre>