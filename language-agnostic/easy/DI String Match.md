Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
<pre>
If S[i] == "I", then A[i] < A[i+1]
If S[i] == "D", then A[i] > A[i+1]
</pre>

Example 1:
<pre>
Input: "IDID"
Output: [0,4,1,3,2]
</pre>

Example 2:
<pre>
Input: "III"
Output: [0,1,2,3]
</pre>

Example 3:
<pre>
Input: "DDI"
Output: [3,2,0,1]
</pre>
 

Note:  
<pre>
1 <= S.length <= 10000
S only contains characters "I" or "D".
</pre>

<pre><code>
/**
 * @param {string} S
 * @return {number[]}
 */
var diStringMatch = function(S) {
    
    let arr = [];
    let len = S.length;
    let log = console.log;
    // increase and decrease variables were created as starting points for respective scenarios.
    // Each variable updates upon corresponding letter being detected.
    let increase = 0;
    let decrease = len;
    
    for (let i = 0; i < (len + 1); i++) {
            // First pushes current value, then updates variable in case detected again.
            if (S[i] === "I") { arr.push(increase); increase += 1; }
            else { arr.push(decrease); decrease -= 1; }
        }
    
    return arr;
    
    
};
</code></pre>