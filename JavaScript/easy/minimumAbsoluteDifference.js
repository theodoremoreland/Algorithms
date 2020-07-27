// Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements. 
// Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
// a, b are from arr
// a < b
// b - a equals to the minimum absolute difference of any two elements in arr
 
// Example 1:
// Input: arr = [4,2,1,3]
// Output: [[1,2],[2,3],[3,4]]
// Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.

// Example 2:
// Input: arr = [1,3,6,10,15]
// Output: [[1,3]]

// Example 3:
// Input: arr = [3,8,-10,23,19,-4,-14,27]
// Output: [[-14,-10],[19,23],[23,27]]

/**
 * @param {number[]} arr
 * @return {number[][]}
 */
var minimumAbsDifference = function(arr) {
    arr.sort((a,b) => a - b);
    min = (arr[1] - arr[0]); // starting m.a.d.
    madPairs = [];
    // following loop will find the difference of each pair and reassign "min" if lower than "min".
    for (let i = 0; i < arr.length; i++) {
        current = arr[i];
        next = arr[i+1];
        if (next - current < min) { min = next - current; } 
    }
    // following loop will push pair into "madPairs" array if difference is equal to "min".
    for (let i = 0; i < arr.length; i++) {
        current = arr[i];
        next = arr[i+1];
        if (next - current === min) { madPairs.push([current, next]); }
    }
    
    return madPairs
};