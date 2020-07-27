/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s = s.toLowerCase().replace(/[^0-9a-z]/g, "");
    let norm = s.split("");
    let rev = s.split("").reverse();
    for (let i = 0; i < norm.length; i++) {
        if (norm[i] === rev[i]) {valid = true;} 
        else { return false; }
    }
    return true;
};