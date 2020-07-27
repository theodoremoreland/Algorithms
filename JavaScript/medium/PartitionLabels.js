// A string S of lowercase letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.

// Example 1:
// Input: S = "ababcbacadefegdehijhklij"
// Output: [9,7,8]
// Explanation:
// The partition is "ababcbaca", "defegde", "hijhklij".
// This is a partition so that each letter appears in at most one part.
// A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
// Note:

// S will have length in range [1, 500].
// S will consist of lowercase letters ('a' to 'z') only.


/**
 * @param {string} S
 * @return {number[]}
 */
var partitionLabels = function (S) {

    // find the last index of the first letter in the string
    // the last index of the first letter becomes the "champion" index (i.e. the reigning winner of the partition's end)
    // create a temporary partition that starts from the beginning of string to the champion index
    // loop through each letter in temporary partition and compare each of their last indexes
    // the highest last index becomes the "contender" index
    // if the contender index is higher than the chmapion index, the contender becomes the champion and repeat the last 3 steps
    // once contender is no longer higher than champion, finalize the partition and add its string length to array
    // remove the newly created partition from original string and check to see if any letters are left over
    // if there are letters still remaining, repeat each of the 8 steps above.
    // continue until all partitions are removed from original string and no letters are left remaining
    // return array (i.e. "partitions")

    let s = S;
    let partition = "";
    let partitions = [];

    function findMaxIdx(tempPartition, s) {
        let max = 0;
        for (letter of tempPartition) {
            letter_idx = s.lastIndexOf(letter);
            if (letter_idx > max) { max = letter_idx; }
        }
        return max;
    }


    do {


        // determine the smallest possible length of partition
        let champion = s.lastIndexOf(s[0]);

        // create temporary partition from smallest possible length
        let tempPartition = s.slice(0, champion + 1);

        // uses a function that will increase smallest possible length if necessary
        // by looping through each letter is tempPartition are returning the highest last index
        let contender = findMaxIdx(tempPartition, s);

        // loop until contender no longer beats champion and thus partition can be finalized
        while (contender > champion) {
            champion = contender;
            temp = s.slice(0, champion + 1);
            contender = findMaxIdx(temp, s);
        }

        // create final partition
        partition = s.slice(0, champion + 1);

        // add length of partition to array
        partitions.push(partition.length);

        // remove partition from original / previous string
        s = s.slice(champion + 1);

        // loop until no letters are remaining   
    } while (s.length !== 0)

    return partitions;

};