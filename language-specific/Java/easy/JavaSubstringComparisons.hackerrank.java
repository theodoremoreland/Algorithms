// Given a string, s, and an integer, k , complete the function so that it finds the lexicographically smallest and largest substrings of length k.

// Input Format
// The first line contains a string denoting .
// The second line contains an integer denoting .

// Output Format
// Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

// Sample Input 0
// welcometojava
// 3

// Sample Output 0
// ava
// wel

import java.util.Scanner;

class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 0; i < s.length() - (k - 1); i++) {
            String sub = s.substring(i, i + k);
            if (sub.compareTo(smallest) < 0)
                smallest = sub;
            if (sub.compareTo(largest) > 0)
                largest = sub;
        }

        return smallest + "\n" + largest;
    }
}