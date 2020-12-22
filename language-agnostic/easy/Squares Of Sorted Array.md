Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:
<pre>
Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
</pre>

Example 2:
<pre>
Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
</pre>
 

Note:  
1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A is sorted in non-decreasing order.

<pre><code>
/**
 * @param {number[]} A
 * @return {number[]}
 */
var sortedSquares = function(A) {
    A = A.map(x => x**2);
    A.sort((a,b) => a-b);
    return A;
};
</code></pre>

