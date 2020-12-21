/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
    for (let i in haystack) {
        i = +i;
        if (haystack.slice(i, i + needle.length) === needle) {
            return i;
         }
       }
    if (needle === "") { return 0;}
        else { return -1; }
};