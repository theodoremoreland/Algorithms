Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:
<pre>
Input: "babad"
Output: "bab"
</pre>
Note: "aba" is also a valid answer.

Example 2:
<pre>
Input: "cbbd"
Output: "bb"
</pre>

<pre><code>
/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function (s) {

    let window = 1;
    let lp = "";

    function isPalindrome(str) {
        for (let i = 0, j = (str.length - 1); i < (str.length / 2); i++ , j--) {
            if (str[i] !== str[j]) { return false; }
        }
        return true;
    }

    if (isPalindrome(s)) { return s; }

    while (window <= s.length) {
        for (let i = 0; i < s.length; i++) {
            str = s.slice(i, i + window);
            if (isPalindrome(str) && str.length > lp.length) { lp = str; }
        }
        window += 1;
    }

    return lp;
};
</code></pre>