In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
Return the element repeated N times.

Example 1:
<pre>
Input: [1,2,3,3]
Output: 3
</pre>

Example 2:
<pre>
Input: [2,1,2,5,3,2]
Output: 2
</pre>

Example 3:
<pre>
Input: [5,1,5,2,5,3,5,4]
Output: 5
</pre>
 

Note:  
4 <= A.length <= 10000
0 <= A[i] < 10000
A.length is even

<pre><code>
/**
 * @param {number[]} A
 * @return {number}
 */
var repeatedNTimes = function(A) {
    let len = A.length;
    let elements = {};
    for (elem of A) {
        elements[elem] = elements[elem] === undefined ? 1 : elements[elem] += 1;
        if (elements[elem] === len / 2) { return elem; }
    }
    
};
</code></pre>