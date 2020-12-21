// You are given n pairs of strings. Two pairs (a,b) and (c,d) are identical if a=c and b=c. That also implies (a,b) is not same as (b,a). After taking each pair as input, you need to print number of unique pairs you currently have.
// Complete the code in the editor to solve this problem.

// Input Format
// In the first line, there will be an integer T denoting number of pairs. Each of the next T lines will contain two strings seperated by a single space.

// Output Format
// Print  lines. In the  line, print number of unique pairs you have after taking  pair as input.

// Sample Input
// 5
// john tom
// john mary
// john tom
// mary anna
// mary anna

// Sample Output
// 1
// 2
// 2
// 3
// 3

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> set = new HashSet<String>();

        for (int i = 0; i < t; i++) {
            String pair = pair_left[i] + " " + pair_right[i];
            set.add(pair);
            System.out.println(set.size());
        }

    }
}