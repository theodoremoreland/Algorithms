/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(arr) {
    
    for (let i = 0; i < arr.length; i++) {
        elem = arr[i];
            
            if (elem === arr[i+1]) {
                arr.splice(i,1);
                i--;
        }
    }
    return arr.length
};