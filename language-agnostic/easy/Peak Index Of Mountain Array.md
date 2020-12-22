Let's call an array A a mountain if the following properties hold:
A.length >= 3

There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]

Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

Example 1:
<pre>
Input: [0,1,0]
Output: 1
</pre>

Example 2:
<pre>
Input: [0,2,1,0]
Output: 1
</pre>

Note:
<pre>
3 <= A.length <= 10000
0 <= A[i] <= 10^6
A is a mountain, as defined above.
</pre>

<pre><code>
/**
 * @param {number[]} A
 * @return {number}
 */
var peakIndexInMountainArray = function(A) {
    let max = A[0];
    let idx = 1;
    for (let i = 1; i < A.length - 1; i++) {
        if (A[i] > max) { max = A[i]; idx = i;}
    } return idx;
};
</code></pre>