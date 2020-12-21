// Given two strings s and t , write a function to determine if t is an anagram of s.

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    let obj1 = {};
    let obj2 = {};
    for (let letter of s) {
        if (typeof obj1[letter] !== "number") { obj1[letter] = 0}
        obj1[letter] += 1;
    }
    for (let letter of t) {
        if (typeof obj2[letter] !== "number") { obj2[letter] = 0}
        obj2[letter] += 1;
    }
    
    let biggerObject = Object.keys(obj1).length >= Object.keys(obj2).length ? obj1 : obj2;

    for (let key in biggerObject) {
        if (obj1[key] === obj2[key]) { continue; }
        else { return false ;}
    }
    return true;
};