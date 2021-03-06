We distribute some number of candies, to a row of n = num_people people in the following way:  

We then give 1 candy to the first person, 2 candies to the second person, and so on until we give n candies to the last person.
Then, we go back to the start of the row, giving n + 1 candies to the first person, n + 2 candies to the second person, and so on until we give 2 * n candies to the last person.

This process repeats (with us giving one more candy each time, and moving to the start of the row after we reach the end) until we run out of candies.  The last person will receive all of our remaining candies (not necessarily one more than the previous gift).

Return an array (of length num_people and sum candies) that represents the final distribution of candies.

Example 1:
<pre>
Input: candies = 7, num_people = 4
Output: [1,2,3,1]
</pre
>
Explanation:
<pre>
On the first turn, ans[0] += 1, and the array is [1,0,0,0].
On the second turn, ans[1] += 2, and the array is [1,2,0,0].
On the third turn, ans[2] += 3, and the array is [1,2,3,0].
On the fourth turn, ans[3] += 1 (because there is only one candy left), and the final array is [1,2,3,1].
</pre>

Example 2:
<pre>
Input: candies = 10, num_people = 3
Output: [5,2,3]
</pre>

Explanation: 
<pre>
On the first turn, ans[0] += 1, and the array is [1,0,0].
On the second turn, ans[1] += 2, and the array is [1,2,0].
On the third turn, ans[2] += 3, and the array is [1,2,3].
On the fourth turn, ans[0] += 4, and the final array is [5,2,3].
</pre>
 
Constraints:
<pre>
1 <= candies <= 10^9
1 <= num_people <= 1000
<pre>

<pre><code>
/**
 * @param {number} candies
 * @param {number} num_people
 * @return {number[]}
 */
var distributeCandies = function(candies, num_people) {
    let amount = 0; 
    let idx = 0;
    let candyPerPerson = new Array(num_people).fill(0);
    
    while (candies > 0) {
        amount += 1; // Amount supposed to be given.
        
        // If the amount that was supposed to be given exceeds number of candies remaining...
        // the amount to be given is lowered to the number of candies remaining.
        if (candies - amount < 0) { amount = candies; }
        candyPerPerson[idx] += amount; 
        candies -= amount; // Amount of candies to be given will always be subtracted from candies remaining.
        
        // if idx isn't equal to last position in array, increment by 1.
        // else reset to first position equivalent.
        if (idx !== num_people - 1) { idx += 1; }
        else { idx = 0; }
    }
    
    return candyPerPerson;
};
</code></pre>