Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
You may return any answer array that satisfies this condition.

Example 1:
<pre>
Input: [3,1,2,4]
Output: [2,4,3,1]
</pre>
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 
Note: 
1 <= A.length <= 5000
0 <= A[i] <= 5000

<pre><code>
/**
 * @param {number[]} A
 * @return {number[]}
 */
var sortArrayByParity = function(A) {
    let len = A.length;
    for (let i = 0; i < len; i++) {
        let num = A[i];
        if (num % 2 !== 0) { A.splice(i,1); A.push(num); i--; len--;}
    } return A;
};
</code></pre>