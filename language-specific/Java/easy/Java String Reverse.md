// Given a string A, print Yes if it is a palindrome, print No otherwise.

// Constraints
// A will consist at most 50 lower case english letters.

// Sample Input
// madam

// Sample Output
// Yes

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B = "";
        for (int i = A.length() - 1; i > -1; i--) {
            B += A.charAt(i);
        }
        if (A.equals(B))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}