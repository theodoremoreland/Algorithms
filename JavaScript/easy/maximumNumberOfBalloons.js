// Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
// You can use each character in text at most once. Return the maximum number of instances that can be formed.

// Example 1:
// Input: text = "nlaebolko"
// Output: 1

// Example 2:
// Input: text = "loonbalxballpoon"
// Output: 2

// Example 3:
// Input: text = "leetcode"
// Output: 0
 
// Constraints:
// 1 <= text.length <= 10^4
// text consists of lower case English letters only.

/**
 * @param {string} text
 * @return {number}
 */
var maxNumberOfBalloons = function(text) {
    let count = 0;
    let new_balloon = false;
    do {
      for (let letter of "balloon") {
           let letter_idx = text.indexOf(letter);
           new_balloon = letter_idx === -1 ? false : true;
           if (new_balloon === true) { text = text.replace(letter, ""); } 
           else { break; }
           }
           count = new_balloon === true ? count += 1 : count;
    } while (new_balloon === true)
                               
    return count;
};