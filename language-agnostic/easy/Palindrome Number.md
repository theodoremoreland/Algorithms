<pre><code>
/**
 * @param {number} x
 * @return {boolean}
 */
let isPalindrome = function(x) {
    
    let num = x;
    let att = []; 
    let digits = [];
    let rev = 0;
    let j = 1;
    att.push(num);
    
    // removes one digit then adds result to array up to last digit
    while (num >= 10) {
        num /= 10
        num = Math.floor(num);
        att.push(num);
    } 
    
    // adds each digit to array in reverse order
    for (let i = 0; i < att.length - 1; i++) {
         digits.push(att[i] - att[i + 1] * 10);   
    }
    
    // adds first digit to end of digits array
    digits.push(att.slice(-1)[0]);


    // multiplies each digit by ten then adds next digit up until last digit
    for (let i = 0; i < digits.length - 1 ; i++) {
        rev = digits[i] * 10;
        rev += digits[j];
        digits[j] = rev;
        j++
    }
    
    // checks for negative number, then palindrome of mulitple digits or single digit
    if (x < 0) {return false;}
    else if (rev === x || digits[0] === att[0]) {return true;}
    else {return false;}
};
</code></pre>