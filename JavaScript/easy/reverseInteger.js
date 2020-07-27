/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    x = x.toString().split('').reverse();
    if (x.slice(-1) == '-') { x.unshift(x.pop('-')); }
    x = parseInt(x.join(''));
    if (x > 0x7FFFFFFF || x < -0x7FFFFFFF) {x = 0}
    return x;
};