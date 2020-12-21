<pre><code>
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        // The string must begin with between 0-3 (inclusive) lowercase letters.
        // Immediately following the letters, there must be a sequence of digits (0-9).
        // The length of this segment must be between 2 and 8, both inclusive.
        // Immediately following the numbers, there must be atleast 3 uppercase letters.
        Scanner scan = new Scanner(System.in);
        String pattern = "[a-z]{0,3}\\d{2,8}[A-Z]{3,}";
        int ids = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < ids; i++) {
            String id = scan.nextLine();
            // System.out.println(id);
            if (id.matches(pattern) == true)
                System.out.println("VALID");
            else
                System.out.println("INVALID");
        }
    }
}
</code></pre>