<pre><code>
/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    if  (s === "") { return -1; }
    
    for (let i in s) {
        let letter = s[i];
        let test_string = s.replace(letter, "0");
        let pos = test_string.indexOf(letter);
       
        if (pos > -1) { continue; }
        else if ( pos === -1 && i !== undefined ) { return i; }
    }
    return -1;
};
</code></pre>