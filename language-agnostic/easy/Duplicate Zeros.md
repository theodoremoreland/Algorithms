Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.

Example 1:
<pre>
Input: [1,0,2,3,0,4,5,0]
Output: null
</pre>
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

Example 2:
<pre>
Input: [1,2,3]
Output: null
</pre>
Explanation: After calling your function, the input array is modified to: [1,2,3]

<pre><code>
/**
 * @param {number[]} arr
 * @return {void} Do not return anything, modify arr in-place instead.
 */
var duplicateZeros = function(arr) {
    let len = arr.length;
    for (let i = 0; i < len; i++) {
        let num = arr[i];
        if (num === 0) { arr.splice(i, 0, 0); i+=1; }
    }
    while (arr.length > len) {
        arr.pop();
    }
};
</code></pre>