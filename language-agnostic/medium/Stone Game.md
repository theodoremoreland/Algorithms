Alex and Lee play a game with piles of stones.  There are an even number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].

The objective of the game is to end with the most stones.  The total number of stones is odd, so there are no ties.

Alex and Lee take turns, with Alex starting first.  Each turn, a player takes the entire pile of stones from either the beginning or the end of the row.  This continues until there are no more piles left, at which point the person with the most stones wins.

Assuming Alex and Lee play optimally, return True if and only if Alex wins the game.

Example 1:
<pre>
Input: [5,3,4,5]
Output: true
</pre>
Explanation:   
Alex starts first, and can only take the first 5 or the last 5.
Say he takes the first 5, so that the row becomes [3, 4, 5].
If Lee takes 3, then the board is [4, 5], and Alex takes 5 to win with 10 points.
If Lee takes the last 5, then the board is [3, 4], and Alex takes 4 to win with 9 points.
This demonstrated that taking the first 5 was a winning move for Alex, so we return true.
 
Note:
<pre>
2 <= piles.length <= 500
piles.length is even.
1 <= piles[i] <= 500
sum(piles) is odd.
</pre>

<pre><code>
/**
 * @param {number[]} piles
 * @return {boolean}
 */
var stoneGame = function(piles) {
    //function that removes the highest number
    //add highest number to alex
    //add highest number to lee
    //highest wins
    let len = piles.length + 1;
    let alexScore = 0;
    let leeScore = 0;
    
    function removeHighestNum(arr) {
        var max = arr.reduce(function(a, b) {
                  return Math.max(a, b);
        });
        let idx = arr.indexOf(max);
        piles.splice(idx, 1);
        return max;
    }
    
    for (let i = 1; i < len; i++) {
        if (i % 2 > 0) { alexScore += removeHighestNum(piles); }
        else { leeScore += removeHighestNum(piles); }
    }
    
    if (alexScore > leeScore) { return true; }
    else { return false; }
};
</code></pre>