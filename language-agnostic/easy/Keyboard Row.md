Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American QWERTY keyboard

Example: 
<pre> 
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
</pre>

Note:  
You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.

<pre><code>
/**
 * @param {string[]} words
 * @return {string[]}
 */
var findWords = function(words) {
    let row1 = "qwertyuiop";
    let row2 = "asdfghjkl";
    let row3 = "zxcvbnm";
    let arr = [];
    for (let word of words) {
        let top = false;
        let mid = false;
        let bottom = false;
        for ( let letter of word ) {
            if (row1.includes(letter.toLowerCase())) { top = true; }
            if (row2.includes(letter.toLowerCase())) { mid = true; }
            if (row3.includes(letter.toLowerCase())) { bottom = true; } 
        }
        if (top && mid || top && bottom || mid && bottom) {}
        else { arr.push(word); } 
    }
    return arr;
};
</code></pre>