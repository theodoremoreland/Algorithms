Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).

Note:  
s could be empty and contains only lowercase letters a-z.
p could be empty and contains only lowercase letters a-z, and characters like . or *.

Example 1:
<pre>
Input:
s = "aa"
p = "a"
Output: false
</pre>
Explanation: "a" does not match the entire string "aa".

Example 2:
<pre>
Input:
s = "aa"
p = "a*"
Output: true
</pre>
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".

Example 3:
<pre>
Input:
s = "ab"
p = ".*"
Output: true
</pre>
Explanation: ".*" means "zero or more (*) of any character (.)".

Example 4:
<pre>
Input:
s = "aab"
p = "c*a*b"
Output: true
</pre>
Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore, it matches "aab".

Example 5:
<pre>
Input:
s = "mississippi"
p = "mis*is*p*."
Output: false
</pre>

<pre><code>
/**
 * @param {string} s
 * @param {string} p
 * @return {boolean}
 */
var isMatch = function (s, p) {
    let regex = new RegExp(`^${p}$`);
    let match = regex.test(s);
    return match;
};
</code></pre>