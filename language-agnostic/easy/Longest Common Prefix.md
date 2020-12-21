/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
   
    let first_word = strs[0] === undefined ? "" : strs[0];  // first word is either string or empty string, but never undefined.
    let str = "";
    let match = true;
    
    // loops through each letter in first word
    for (let i = 0; i < first_word.length; i++) {
        let letter1 = first_word[i]; // defines base letter to be checked.
        
        // loops through each word then compares base letter to every letter at current index / "i";
        strs.forEach(word => {
                     let letter2 = word[i];
                     if (letter1 !== letter2) { match = false; }
                     else if (letter1 === letter2 && i > word.length ) { match = false;} // if equal, but position exceeds len.
                     });
        if (match) { str += first_word[i]; } // if math remains true thus all words share prefix, add letter to string.
        else { return str; }; 
        
    }
    return str;
};